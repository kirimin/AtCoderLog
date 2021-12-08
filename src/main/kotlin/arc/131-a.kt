package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem131a(a, b))
}

fun problem131a(a: Long, b: Long): String {
    var right = a.toString()
    var left = (b / 2).toString()
    if (b % 2 != 0L) left += "5"
    if (left[0] == '0') left = left.drop(1)
    return left + "0" + right
}
