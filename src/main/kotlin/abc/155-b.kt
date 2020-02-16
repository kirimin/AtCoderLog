package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem155b(n, a))
}

fun problem155b(n: Int, a: List<Int>): String {
    return if (a.filter { it % 2 != 0 || it % 3 == 0 || it % 5 == 0 }.size == n) "APPROVED" else "DENIED"
}