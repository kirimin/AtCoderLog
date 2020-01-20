package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem152b(a, b))
}

fun problem152b(a: Int, b: Int): String {
    var aStr = ""
    for (i in 0 until b) {
        aStr += a.toString()
    }
    var bStr = ""
    for (i in 0 until a) {
        bStr += b.toString()
    }
    return if (aStr > bStr) bStr else aStr
}