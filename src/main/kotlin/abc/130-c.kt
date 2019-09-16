package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val w = sc.nextLong()
    val h = sc.nextLong()
    val x = sc.nextLong()
    val y = sc.nextLong()
    println(problem130c(w, h, x, y))
}

fun problem130c(w: Long, h: Long, x: Long, y: Long): String {

    val num = if (x + x == w &&  y + y == h) 1 else 0
    return "${(w * h / 2.0)} $num"
}