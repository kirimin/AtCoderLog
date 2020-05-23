package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem043a(n))
}

fun problem043a(n: Int): Int {
    return (1..n).toList().reduce { acc, i -> acc + i }
}