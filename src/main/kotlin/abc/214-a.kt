package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem214a(n))
}

fun problem214a(n: Int): Int {
    return if (n <= 125) 4 else if (n <= 211) 6 else 8
}