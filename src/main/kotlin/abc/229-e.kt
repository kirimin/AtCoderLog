package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem229e(n, m, ab))
}

fun problem229e(n: Int, m: Int, ab: List<Pair<Int, Int>>): String {
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

    val graph = Array(n) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        graph[a - 1].add(b - 1)
    }

    val uf = UnionFind(n)
    val ans = mutableListOf<Int>()
    ans.add(0)
    var count = 0
    for (i in n - 1 downTo 1) {
        count++
        for (j in graph[i]) {
            if (!uf.isSameRoot(i, j)) {
                uf.merge(i, j)
                count--
            }
        }
        ans.add(count)
    }

    return ans.reversed().joinToString("\n")
}
