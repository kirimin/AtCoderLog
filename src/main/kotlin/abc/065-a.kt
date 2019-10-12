package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem065a(x, a, b))
}

fun problem065a(x: Int, a: Int, b: Int): String {
    return when {
        b - a > x -> "dangerous"
        b - a > 0 -> "safe"
        else -> "delicious"
    }
}