package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next().toInt()
    val a = sc.next().toInt()
    println(problem130a(x, a))
}

fun problem130a(x: Int, a: Int): Int {
    return if (x < a) 0 else 10
}