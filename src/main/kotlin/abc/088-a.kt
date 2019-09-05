package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = sc.nextInt()
    println(problem088a(n, a))
}

fun problem088a(n: Int, a: Int): String {
    return if (n % 500 <= a) "Yes" else "No"
}