package other_contests.company.panasonic

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextLong()
    val w = sc.nextLong()
    println(problempanasonic2020b(h, w))
}

fun problempanasonic2020b(h: Long, w: Long): Long {
    if (h == 1L || w == 1L) return 1
    return h * w / 2 + if (h * w % 2 != 0L) 1 else 0
}