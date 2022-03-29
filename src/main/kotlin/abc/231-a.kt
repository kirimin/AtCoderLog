package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val d = sc.nextInt()
    println(problem231a(d))
}

fun problem231a(d: Int): Double {
    return d / 100.0
}