package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = (0 until n).map { sc.next().toInt() }
    println(problem300a(n, a, b, c))
}

fun problem300a(n: Int, a: Int, b: Int, c: List<Int>): Int {
    val ans = a + b
    for (i in 0 until c.size) {
        if (c[i] == ans) return i + 1
    }
    return 0
}