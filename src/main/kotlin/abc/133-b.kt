package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()
    val x = (0 until n).map { (0 until d).map { sc.next().toInt() }  }
    println(problem133b(n, d, x))
}

fun problem133b(n: Int, d: Int, x: List<List<Int>>): Int {
    var count = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            var sum = 0.0
            for (k in 0 until d) {
                sum += Math.pow(Math.abs(x[i][k] - x[j][k]).toDouble(), 2.toDouble())
            }
            val sqrt = Math.sqrt(sum)
            if (sqrt == sqrt.toInt().toDouble()) {
                count++
            }
        }
    }
    return count
}