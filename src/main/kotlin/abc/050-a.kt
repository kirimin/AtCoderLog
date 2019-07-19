package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val op = sc.next()
    val b = sc.nextInt()

    val output = when (op) {
        "+" -> a + b
        "-" -> a - b
        else -> throw IllegalArgumentException()
    }
    println(output)
}
