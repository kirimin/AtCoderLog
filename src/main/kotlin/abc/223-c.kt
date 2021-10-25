package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toDouble() to sc.next().toDouble() }
    println(problem223c(n, ab))
}

fun problem223c(n: Int, ab: List<Pair<Double, Double>>): Double {
    val times = DoubleArray(n)
    for (i in 0 until n) {
        times[i] = ab[i].first / ab[i].second
    }
    var time = times.sum() / 2
    var distance = 0.0
    var last = 0
    for (i in 0 until n) {
        if (time - times[i] <= 0) {
            last = i
            break
        }
        time -= times[i]
        distance += ab[i].first
        last = i
    }
    distance += time * ab[last].second

    return distance
}