package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem237a(n))
}

fun problem237a(n: Long): String {
    return if (n in -2147483648 until 2147483648) "Yes" else "No"
}