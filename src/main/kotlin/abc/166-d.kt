package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    println(problem166d(x))
}

fun problem166d(x: Long): String {
    for (i in 0..10000) {
        for (j in -1000..1000) {
            if (Math.pow(i.toDouble(), 5.toDouble()).toLong() - Math.pow(j.toDouble(), 5.toDouble()).toLong() == x) {
                return "$i $j"
            }
        }
    }
    return ""
}