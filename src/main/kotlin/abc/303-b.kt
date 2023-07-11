package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until m).map { (0 until n).map { sc.next().toInt() } }
    println(problem303b(n, m, a))
}

fun problem303b(n: Int, m: Int, a: List<List<Int>>): Int {
    var count = 0
    for (p1 in 1 until n + 1) {
        for (p2 in p1 + 1 until n + 1) {
            var tonari = false
            for (i in 0 until m) {
                for (j in 0 until n - 1) {
                    if (a[i][j] == p1 && a[i][j + 1] == p2) tonari = true
                    if (a[i][j] == p2 && a[i][j + 1] == p1) tonari = true
                }
            }
            if (!tonari) count++
        }
    }
    return count
}