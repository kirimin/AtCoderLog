package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem064b(n, a))
}

fun problem064b(n: Int, a: List<Int>): Int {
    return a.max()!! - a.min()!!
}