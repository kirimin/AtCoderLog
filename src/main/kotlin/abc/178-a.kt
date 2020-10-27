package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem178a(x))
}

fun problem178a(x: Int): Int {
    return when (x) {
        0 -> 1
        else -> 0
    }
}