package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem159d(n, a))
}

fun problem159d(n: Int, a: List<Int>): Int {
    return 0
}