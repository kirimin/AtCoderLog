package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n - 1).map { sc.next().toInt() }
    println(problem151b(n, k, m, a))
}

fun problem151b(n: Int, k: Int, m: Int, a: List<Int>): Int {
    var sum = 0
    for (i in 0 until n - 1) {
       sum += a[i]
    }
    var ans = -1
    for (i in 0..k) {
        if (m <= (sum + i) / n) {
            ans = i
            break
        }
    }
    return ans
}