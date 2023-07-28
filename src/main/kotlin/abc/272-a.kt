package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem272a(a))
}

fun problem272a(a: List<Int>): Int {
    return a.sum()
}
