package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val abc = (0 until m).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toLong()) }
    println(problem218e(n, m, abc))
}

fun problem218e(n: Int, m: Int, abc: List<Triple<Int, Int, Long>>): Long {
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

    var point = abc.map { it.third }.sum()
    val abc = abc.sortedBy { it.third }
    val uf = UnionFind(n)
    for (i in 0 until m) {
        val (a, b, c) = abc[i]
        if (c <= 0) {
            uf.merge(a - 1, b - 1)
            point -= c
        } else {
            if (!uf.isSameRoot(a - 1, b - 1)) {
                uf.merge(a - 1, b - 1)
                point -= c
            }
        }
    }
    return point
}
