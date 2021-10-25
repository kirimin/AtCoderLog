package typical90

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem078(n, m, ab))
}

fun problem078(n: Int, m: Int, ab: List<Pair<Int, Int>>): Int {
    val path = Array(n) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        if (a > b) {
            path[a - 1].add(b - 1)
        } else {
            path[b - 1].add(a - 1)
        }
    }
    var count = 0
    for (i in 0 until n) {
        if (path[i].size == 1) count++
    }
    return count
}
