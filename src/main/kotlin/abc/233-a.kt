package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem233a(x, y))
}

fun problem233a(x: Int, y: Int): Int {
    return Math.max((y - x), 0) / 10 + if ((Math.max((y - x), 0) % 10) != 0) 1 else 0
}