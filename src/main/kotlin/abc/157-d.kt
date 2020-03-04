package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val k = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    val cd = (0 until k).map { sc.next().toInt() to sc.next().toInt() }
    println(problem157d(n, m, k, ab, cd))
}

fun problem157d(
    n: Int,
    m: Int,
    k: Int,
    ab: List<Pair<Int, Int>>,
    cd: List<Pair<Int, Int>>
): String {
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

    val dame = Array<MutableSet<Int>>(n + 1) { mutableSetOf() }
    val uf = UnionFind(n + 1)
    for (i in 0 until m) {
        val (a, b) = ab[i]
        dame[a].add(b)
        dame[b].add(a)
        uf.merge(a, b)
    }
    for (i in 0 until k) {
        val (c, d) = cd[i]
        if (!uf.isSameRoot(c, d)) continue
        dame[c].add(d)
        dame[d].add(c)
    }
    val ans = mutableListOf<Int>()
    for (i in 1..n) {
        val mem = uf.groupSize(i) - 1
        ans.add(mem - dame[i].size)
    }
    return ans.joinToString(" ")
}