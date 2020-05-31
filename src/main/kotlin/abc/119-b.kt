package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toDouble() to sc.next() }
    println(problem119b(n, xy))
}

fun problem119b(n: Int, xy: List<Pair<Double, String>>): Double {
    val BTC = 380000.0
    var sum = 0.0
    for (i in 0 until n) {
        val xyi = xy[i]
        if (xyi.second == "BTC") {
            sum += xyi.first * BTC
        } else {
            sum += xyi.first
        }
    }
    return sum
}