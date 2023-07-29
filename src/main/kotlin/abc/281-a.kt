package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem281a(n))
}

fun problem281a(n: Int): String {
    return (n downTo 0).joinToString("\n")
}