package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem252c(n, s))
}

fun problem252c(n: Int, s: List<String>): Int {
    val count = Array(10) { mutableListOf<Int>() }
    val count2 = Array(10) { mutableListOf<Int>() }
    for (i in 0 until n) {
        for (j in 0 until 10) {
            count[j].add((count2[j].count { it == s[i].indexOf(j.toString()) } * 10) + s[i].indexOf(j.toString()))
            count2[j].add(s[i].indexOf(j.toString()))
        }
    }
    return count.map { it.max() }.minBy { it!! }!!
}