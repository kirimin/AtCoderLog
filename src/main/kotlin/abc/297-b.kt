package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem297b(s))
}

fun problem297b(s: String): String {
    val b1 = s.indexOfFirst { it == 'B' }
    val b2 = s.indexOfLast { it == 'B' }
    if (b1 % 2 == b2 % 2) return "No"
    var r1 = s.indexOfFirst { it == 'R' }
    var r2 = s.indexOfLast { it == 'R' }
    var k = s.indexOfLast { it == 'K' }
    if (!(r1 < k && k < r2)) return "No"
    return "Yes"
}