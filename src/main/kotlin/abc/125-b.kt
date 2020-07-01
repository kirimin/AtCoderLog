package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val v = (0 until n).map { sc.next().toInt() }
    val c = (0 until n).map { sc.next().toInt() }
    println(problem125b(n, v, c))
}

fun problem125b(n: Int, v: List<Int>, c: List<Int>): Int {
    var sum = 0
    for (i in 0 until n) {
        if (v[i] > c[i]) sum += v[i] - c[i]
    }
    return sum
}