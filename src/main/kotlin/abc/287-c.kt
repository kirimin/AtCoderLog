package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val uv = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem287c(n, m, uv))
}

fun problem287c(n: Int, m: Int, uv: List<Pair<Int, Int>>): String {
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
            if (parent[xRoot] > parent[yRoot]){
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

    val unionFind = UnionFind(n)
    // グループを生成
    for (i in 0 until m) {
        val (a, b) = uv[i]
        if (unionFind.isSameRoot(a - 1, b - 1)) {
            // 閉路がある
        }

        unionFind.merge(a - 1, b - 1)
    }
    var root = unionFind.root(0)

    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = uv[i]
        routes[a - 1].add(b - 1)
        routes[b - 1].add(a - 1)
    }

    val distances = IntArray(n) { -1 }
    val queue = ArrayDeque<Int>()
    queue.offer(root)
    distances[root] = 0

    while(!queue.isEmpty()) {
        val current = queue.poll()
        for (i in 0 until routes[current].size) {
            val next = routes[current][i]
            if (distances[next] != -1) {
                continue
            }

            distances[next] = distances[current] + 1
            queue.offer(next)
        }
    }
    return if (distances.sorted() == (0 until n).toList()) "Yes" else "No"
}