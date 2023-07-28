package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem299a(n, s))
}

fun problem299a(n: Int, s: String): String {
    var inn = false
    for (i in 0 until n) {
        if (inn && s[i] == '*') return "in"
        if (inn && s[i] == '|') inn = false
        else if (!inn && s[i] == '|') inn = true
    }
    return "out"
}