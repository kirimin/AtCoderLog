package other_contests.sumitomo_mitsui_2019

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val m1 = sc.nextInt()
    val d1 = sc.nextInt()
    val m2 = sc.nextInt()
    val d2 = sc.nextInt()
    println(problemSumitomoMitsuiA(m1, d1, m2, d2))
}

fun problemSumitomoMitsuiA(m1: Int, d1: Int, m2: Int, d2: Int): Int {
    return if (m1 != m2) 1 else 0
}