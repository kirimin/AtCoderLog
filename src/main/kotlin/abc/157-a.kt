package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem157a(n))
}

fun problem157a(n: Int): Int {
    return n / 2 + if (n % 2 != 0) 1 else 0
}