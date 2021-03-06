package other_contests.company.sumitomo_mitsui

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problemSumitomoMitsui2019c(x))
}

fun problemSumitomoMitsui2019c(x: Int): Int {
    val divide = x / 100
    val remainder = x % 100
    if (remainder == 0) return 1

    val divide2 = remainder / 5
    val ans = if (remainder % 5 != 0) divide2 + 1 else divide2
    return if (ans <= divide) 1 else 0
}