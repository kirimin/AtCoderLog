package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem173a(n))
}

fun problem173a(n: Int): Int {
    var ans = 1000 - (n % 1000)
    return if (ans == 1000) 0 else ans
}