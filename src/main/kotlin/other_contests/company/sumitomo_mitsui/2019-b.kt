package other_contests.company.sumitomo_mitsui

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problemSumitomoMitsui2019b(n))
}

fun problemSumitomoMitsui2019b(n: Int): String {
    val ans = n / 1.08
    if (((ans + 0.9).toInt() * 1.08).toInt() != n) return ":("
    return (ans + 0.9).toInt().toString()
}