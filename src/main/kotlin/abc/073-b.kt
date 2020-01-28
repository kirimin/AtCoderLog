package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val lr = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem073b(n, lr))
}

fun problem073b(n: Int, lr: List<Pair<Int, Int>>): Int {
    var sum = 0
    for (i in 0 until n) {
        sum += lr[i].second - lr[i].first + 1
    }
    return sum
}