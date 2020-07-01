package other_contests.company.panasonic

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    println(problempanasonic2020a(k))
}

fun problempanasonic2020a(k: Int): Int {
    return listOf<Int>(1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51)[k - 1]
}