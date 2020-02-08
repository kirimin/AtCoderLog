package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()
    println(problem123b(a, b, c, d, e))
}

fun problem123b(a: Int, b: Int, c: Int, d: Int, e: Int): Int {
    var sum = 0
    val list = listOf(a, b, c, d, e)
    val zeros = list.filter { it.toString().last().toString().toInt() == 0 }
    val other = list.sortedByDescending { it.toString().last().toString().toInt() }
        .filter { it.toString().last().toString().toInt() != 0 }
    return other
        .map { if (it >= 10) (it.toString().dropLast(1).toString().toInt() + 1) * 10 else 10 }
        .dropLast(1)
        .sum() + zeros.sum() + (other.lastOrNull() ?: 0)
}