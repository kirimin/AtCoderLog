package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem55a(n))
}

fun problem55a(n: Int): Int {
    val cashBackCount =  n / 15
    return 800 * n - (200 * cashBackCount)
}