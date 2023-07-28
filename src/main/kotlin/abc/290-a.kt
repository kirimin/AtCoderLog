package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val b = (0 until m).map { sc.next().toInt() }
    println(problem290a(n, m, a, b))
}

fun problem290a(n: Int, m: Int, a: List<Int>, b: List<Int>): Int {
    var sum = 0
    for (i in 0 until n) {
        val ai = a[i]
        if (b.contains(i + 1)) {
            sum += ai
        }
    }
    return sum
}