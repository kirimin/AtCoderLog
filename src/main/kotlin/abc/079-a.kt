package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem079a(n))
}

fun problem079a(n: Int): String {
    val n = n.toString()
    return if ((n[1] == n[2]) && (n[0] == n[1] || n[2] == n[3])) "Yes" else "No"
}