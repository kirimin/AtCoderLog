package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val cp = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    val q = sc.nextInt()
    val lr = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem010(n, cp, q, lr))
}

fun problem010(n: Int, cp: List<Pair<Int, Int>>, q: Int, lr: List<Pair<Int, Int>>): String {
    val firstClass = IntArray(n + 1)
    val secondClass = IntArray(n + 1)
    for (i in 0 until n) {
        val (c, p) = cp[i]
        when (c) {
            1 -> {
                firstClass[i + 1] += firstClass[i] + p
                secondClass[i + 1] = secondClass[i]
            }
            2 -> {
                firstClass[i + 1] = firstClass[i]
                secondClass[i + 1] += secondClass[i] + p
            }
        }
    }
    val ans = Array(q) { IntArray(2) }
    for (i in 0 until q) {
        val (l, r) = lr[i]
        ans[i][0] = firstClass[r] - firstClass[l - 1]
        ans[i][1] = secondClass[r] - secondClass[l - 1]
    }
    return ans.map { it.joinToString(" ") }.joinToString("\n")
}