package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    println(problem198b(n))
}

fun problem198b(n: String): String {
    var n = n
    for (i in 0 until 100) {
        if (n.take(n.length / 2) == n.takeLast(n.length / 2).reversed()) {
            return "Yes"
        }
        n = "0" + n
    }
    return "No"
}