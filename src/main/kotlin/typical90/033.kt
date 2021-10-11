package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    println(problem033(h, w))
}

fun problem033(h: Int, w: Int): Int {
    if (h == 1 || w == 1) return h * w
    val h = if (h % 2 != 0) h+1 else h
    val w = if (w % 2 != 0) w+1 else w
    return h * w / 4
}