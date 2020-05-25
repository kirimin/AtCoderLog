package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem009b(n, a))
}

fun problem009b(n: Int, a: List<Int>): Int {
    return a.distinct().sorted().takeLast(2)[0]
}