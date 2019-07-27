package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val op = sc.next()
    val b = sc.nextInt()
    println(problem50a(a, op, b))
}

fun problem50a(a: Int, op: String, b: Int): Int {
    return when (op) {
        "+" -> a + b
        "-" -> a - b
        else -> throw IllegalArgumentException()
    }
}
