package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem070a(n))
}

fun problem070a(n: Int): String {
    return n.toString().let { if (it[0] == it[2]) "Yes" else "No" }
}