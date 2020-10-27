package arc

import utilities.debugLog
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    val cd = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem106b(n, m, a, b, cd))
}

fun problem106b(n: Int, m: Int, a: List<Long>, b: List<Long>, cd: List<Pair<Int, Int>>): String {
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
        val (c, d) = cd[i]
        unionFind.merge(c - 1, d - 1)
    }

    val map = HashMap<Int, ArrayList<Int>>()
    for (i in 0 until n) {
        val root = unionFind.root(i)
        if (!map.containsKey(root)) map[root] = ArrayList()
        map[root]!!.add(i)
    }
    for (i in map) {
        val (key, value) = i
        var aSum = 0L
        var bSum = 0L
        for (j in value) {
            aSum += a[j]
            bSum += b[j]
        }
        if (aSum != bSum) return "No"
    }

    return "Yes"
}