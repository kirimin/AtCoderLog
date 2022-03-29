package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    println(problem234a(t.toLong()))
}

fun problem234a(t: Long): Long {
    fun f(x: Long) = (x * x) + (x * 2) + 3
    return f(f(f(t) + t) + f(f(t)))
}
