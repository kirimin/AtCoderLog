package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val uv = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem284c(n, m, uv))
}

fun problem284c(n: Int, m: Int, uv: List<Pair<Int, Int>>): Int {
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

    // グループの数を数える(グループを一つにするために必要な節の数はsize - 1)
    val count = mutableSetOf<Int>()
    for (i in 0 until n) {
        count.add(unionFind.root(i))
    }

    return count.size
}