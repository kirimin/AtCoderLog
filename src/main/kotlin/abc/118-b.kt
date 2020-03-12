package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map {
        (0 until sc.next().toInt()).map { sc.next().toInt() }
    }
    println(problem118b(n, m, a))
}

fun problem118b(n: Int, m: Int, a: List<List<Int>>): Int {
    val foods = IntArray(m) { 0 }
    for (i in 0 until n) {
        val ai = a[i]
        for (j in 0 until ai.size) {
            val aij = ai[j]
            foods[aij - 1]++
        }
    }
    return foods.count { it == n }
}