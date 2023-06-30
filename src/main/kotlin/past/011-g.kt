package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n - 1).map { sc.next().toInt() to sc.next().toInt() }
    println(problem011g(n, ab))
}

fun problem011g(n: Int, ab: List<Pair<Int, Int>>): Any {
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
    for (i in 0 until n - 1) {
        val (a, b) = ab[i]
        if (unionFind.isSameRoot(a - 1, b - 1)) {
            return "No"
        }
        unionFind.merge(a - 1, b - 1)
    }
    val set = mutableSetOf<Int>()
    for (i in 0 until n) {
        set.add(unionFind.root(i))
    }
    if (set.size != 1) return "No"

    return "Yes"
}