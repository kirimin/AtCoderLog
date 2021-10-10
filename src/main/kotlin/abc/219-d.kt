package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    val ab = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem219d(n, x, y, ab))
}

fun problem219d(n: Int, x: Int, y: Int, ab: List<Pair<Int, Int>>): Int {
    val dp = Array(n) { Array(x) { IntArray(y) { Integer.MAX_VALUE } } }
    dp[0][0][0] = 0
    for (i in 1 until n) {
        for (j in 0 until x) {
            for (k in 0 until y) {
                val (a, b) = ab[i]
            }
        }
    }
    return 0
}