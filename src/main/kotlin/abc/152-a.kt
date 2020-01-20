package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    println(problem152a(n, m))
}

fun problem152a(n: Int, m: Int): String {
    return if (n == m) "Yes" else "No"
}