package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val l = sc.nextInt()
    println(problem159c(l))
}

fun problem159c(l: Int): Double {
    return (l / 3.toDouble()) * (l / 3.toDouble()) * (l / 3.toDouble())
}