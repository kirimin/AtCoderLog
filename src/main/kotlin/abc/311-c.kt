package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem311c(n, a))
}

fun problem311c(n: Int, a: List<Int>): String {
    class UnionFind(n: Int) {
        private val parent = IntArray(n) { -1 }

        fun root(x: Int): Int {
            if (parent[x] < 0) return x
            parent[x] = root(parent[x])
            return parent[x]
        }

        fun isSameRoot(x: Int, y: Int) = root(x) == root(y)

        fun merge(x: Int, y: Int) {
            var xRoot = root(x)
            var yRoot = root(y)
            if (xRoot == yRoot) return
            if (parent[xRoot] > parent[yRoot]) {
                val tmp = xRoot
                xRoot = yRoot
                yRoot = tmp
            }
            parent[xRoot] += parent[yRoot]
            parent[yRoot] = xRoot
        }

        fun groupSize(x: Int) = -parent[root(x)]

        override fun toString(): String {
            return parent.toString()
        }
    }

    var heiro = 0
    val unionFind = UnionFind(n + 1)
    // グループを生成
    for (i in 0 until n) {
        if (unionFind.isSameRoot(i + 1, a[i])) {
            // 閉路がある
            heiro = i + 1
        }

        unionFind.merge(i + 1, a[i])
    }


    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until n) {
        val ai = i + 1
        val bi = a[i]
        routes[ai].add(bi)
    }

    val distances = IntArray(n + 1) { -1 }
    val queue = ArrayDeque<Int>()
    queue.offer(heiro)
    distances[heiro] = 0
    val route = mutableListOf<Int>()
    route.add(heiro)
    loop@while(!queue.isEmpty()) {
        val current = queue.poll()
        for (i in 0 until routes[current].size) {
            val next = routes[current][i]
            if (distances[next] != -1) {
                break@loop
            }
            route.add(next)
            distances[next] = distances[current] + 1
            queue.offer(next)
        }
    }
    println(route.size)
    return route.joinToString(" ")
}