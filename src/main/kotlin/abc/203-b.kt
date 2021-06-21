package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    println(problem203b(n, k))
}

fun problem203b(n: Int, k: Int): Long {
    var sum = 0L
    for (i in 1..n) {
        for (j in 1..k) {
            sum += "${i}0${j}".toInt()
        }
    }
    return sum
}