package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem113a(x, y))
}

fun problem113a(x: Int, y: Int): Int {
    return x + y / 2
}