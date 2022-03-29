package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val c = (0 until n + m).map { sc.next().toInt() }
    println(problem245d(n, m, a, c))
}

fun problem245d(n: Int, m: Int, a: List<Int>, c: List<Int>): Int {
    return 0
}