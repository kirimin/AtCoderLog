package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem127a(a, b))
}

fun problem127a(a: Int, b: Int): Int {
    return when {
        a >= 13 -> b
        a >= 6 -> b / 2
        else -> 0
    }
}