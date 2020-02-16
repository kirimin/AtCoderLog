package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    println(problem155e(n))
}

fun problem155e(n: String): Int {
    var res = 0
    for (i in 0 until n.length) {
        val ni = n[i].toString().toInt()
        if (ni >= 5) {
            debugLog("a", 10 - ni)
            res += 9 - ni + 1
        } else {
            debugLog("b", ni)
            res += ni + 1
        }
    }
    return res
}