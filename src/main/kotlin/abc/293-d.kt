package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val abcd = (0 until m).map { arrayOf<Any>(sc.next().toInt(), sc.next(), sc.next().toInt(), sc.next()) }
    println(problem293d(n, m, abcd))
}

fun problem293d(n: Int, m: Int, abcd: List<Array<Any>>): String {
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
    var count = 0
    for (i in 0 until m) {
        val (a, b, c, d) = abcd[i]
        if (unionFind.isSameRoot(a as Int - 1, c as Int - 1)) {
            // 閉路がある
            count++
        }
        unionFind.merge(a as Int - 1, c as Int - 1)
    }
    // グループの数を数える(グループを一つにするために必要な節の数はsize - 1)
    val group = mutableSetOf<Int>()
    for (i in 0 until n) {
        group.add(unionFind.root(i))
    }
    return "$count ${group.size - count}"
}