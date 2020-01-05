package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem103c(n, a))
}

fun problem103c(n: Int, a: List<Int>): Int {
    return a.map { it - 1 }.sum()
}