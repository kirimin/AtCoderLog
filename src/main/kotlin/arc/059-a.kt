package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem059a(n, a))
}

fun problem059a(n: Int, a: List<Int>): Int {
    var min = Integer.MAX_VALUE
    for (i in -100..100) {
        var sum = 0
        for (j in 0 until a.size) {
            sum += (i - a[j]) * (i - a[j])
        }
        min = Math.min(min, sum)
    }
    return min
}