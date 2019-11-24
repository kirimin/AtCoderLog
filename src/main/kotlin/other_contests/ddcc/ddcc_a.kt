package other_contests.ddcc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problemddcca(x, y))
}

fun problemddcca(x: Int, y: Int): Int {
    var sum = 0
    sum += when (x) {
        3 -> 100000
        2 -> 200000
        1 -> 300000
        else -> 0
    }
    sum += when (y) {
        3 -> 100000
        2 -> 200000
        1 -> 300000
        else -> 0
    }
    sum += if (x == 1 && y == 1) 400000 else 0
    return sum
}