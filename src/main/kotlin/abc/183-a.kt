package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem183a(x))
}

fun problem183a(x: Int): Int {
    return if (x >= 0) x else 0
}