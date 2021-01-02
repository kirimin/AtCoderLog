package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem181a(n))
}

fun problem181a(n: Int): String {
    return if (n % 2 == 0) "White" else "Black"
}