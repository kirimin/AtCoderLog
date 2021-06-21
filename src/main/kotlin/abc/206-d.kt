package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem206d(n, a))
}

fun problem206d(n: Int, a: List<Int>): Int {
    class UnionFind(n: Int) {
        val parent = IntArray(n) { -1 }

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

    if (n == 1) return 0

    val unionFind = UnionFind(a.max()!! + 1)
    // グループを生成
    for (i in 0 until n / 2) {
        val l = a[i]
        val r = a[n - 1 - i]
        unionFind.merge(l, r)
    }

    val groupMap = mutableMapOf<Int, Int>()
    for (i in 0 until n) {
        if (groupMap[unionFind.root(a[i])] == null) {
            groupMap[unionFind.root(a[i])] =
                unionFind.groupSize(a[i]) - 1
        }
    }

    return groupMap.toList().sumBy { it.second }
}