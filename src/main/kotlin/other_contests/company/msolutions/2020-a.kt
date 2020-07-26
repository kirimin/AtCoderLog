package other_contests.company.msolutions

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem2020a(x))
}

fun problem2020a(x: Int): Int {
    return when {
        x in 400..599 -> 8
        x in 600..799 -> 7
        x in 800..999 -> 6
        x in 1000..1199 -> 5
        x in 1200..1399 -> 4
        x in 1400..1599 -> 3
        x in 1600..1799 -> 2
        else -> 1
    }
}