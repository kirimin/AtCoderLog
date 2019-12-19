package other_contests.sumitomo_mitsui_2019

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problemSumitomoMitsuiB(n))
}

fun problemSumitomoMitsuiB(n: Int): String {
    val ans = n / 1.08
    if (((ans + 0.9).toInt() * 1.08).toInt() != n) return ":("
    return (ans + 0.9).toInt().toString()
}