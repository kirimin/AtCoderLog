package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val q = sc.nextInt()
    val b = (0 until q).map { sc.next().toLong() }
    println(problem007(n, q, a, b))
}

fun problem007(n: Int, q: Int, a: List<Long>, b: List<Long>): String {
    val treeSet = TreeSet<Long> { x: Long, y: Long ->
        x.compareTo(y)
    }
    treeSet.addAll(a)
    val ans = LongArray(q)
    for (i in 0 until q) {
        val bi = b[i]
        ans[i] =  Math.min(Math.abs(bi - (treeSet.floor(bi) ?: -2000000000)), Math.abs(bi - (treeSet.ceiling(bi) ?: 2000000000)))
    }
    return ans.joinToString("\n")
}
