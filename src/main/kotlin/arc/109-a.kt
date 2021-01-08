package arc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a =sc.next().toInt()
    val b =sc.next().toInt()
    val x =sc.next().toInt()
    val y =sc.next().toInt()
    println(problem109a(a, b, x, y))
}

fun problem109a(a: Int, b: Int, x: Int, y: Int): Int {
    var pattern1 = 0
    pattern1 += x
    pattern1 += y * Math.abs(a - b)

    var pattern2 = 0
    pattern2 += x
    pattern2 += y * Math.abs(a - (b + 1))

    var pattern3 = 0
    pattern3 += x
    pattern3 += x * Math.abs(a - b) * 2

    var pattern4 = 0
    pattern4 += x
    pattern4 += x * Math.abs(a - (b + 1)) * 2
    return listOf(pattern1, pattern2, pattern3, pattern4).min()!!
}