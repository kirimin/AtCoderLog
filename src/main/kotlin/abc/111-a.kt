package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem111a(n))
}

fun problem111a(n: Int): String {
    return n.toString().map { if (it == '9') 1 else 9 }.joinToString("")
}