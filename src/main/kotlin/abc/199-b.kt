package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val b = (0 until n).map { sc.next().toInt() }
    println(problem199b(n, a, b))
}

fun problem199b(n: Int, a: List<Int>, b: List<Int>): Int {
    val range = IntArray(1001) { 0 }
    for (i in 0 until n) {
        val ai = a[i]
        val bi = b[i]
        for (j in ai..bi) {
            range[j]++
        }
    }
    var count = 0
    for (i in 0 until range.size) {
        if (range[i] == n) count++
    }
    return count
}