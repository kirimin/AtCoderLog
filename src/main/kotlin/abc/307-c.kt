package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val ha = sc.nextInt()
    val wa = sc.nextInt()
    val a = (0 until ha).map { sc.next() }

    val hb = sc.nextInt()
    val wb = sc.nextInt()
    val b = (0 until hb).map { sc.next() }

    val hx = sc.nextInt()
    val wx = sc.nextInt()
    val x = (0 until hx).map { sc.next() }
    println(problem307c(ha, wa, a, hb, wb, b, hx, wx, x))
}

fun problem307c(
    ha: Int,
    wa: Int,
    a: List<String>,
    hb: Int,
    wb: Int,
    b: List<String>,
    hx: Int,
    wx: Int,
    x: List<String>
): Int {

    return 0
}