package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem072d(n, p))
}

fun problem072d(n: Int, p: List<Int>): Int {
    var count = 0
    var isSwap = false
    var swapNum = 0
    for (i in 0 until n - 1) {
        val pi = if (isSwap) swapNum else p[i]
        val pi2 = p[i + 1]
        val pi3 = if (i != n - 2) p[i + 2] else i + 2
        val i = i + 1
        if (pi == i && pi2 == i + 1) {
            swapNum = pi
            isSwap = true
            count++
            continue
        }
        if (pi == i && pi2 != i + 1) {
            swapNum = pi
            isSwap = true
            count++
            continue
        }
        if (pi != i && pi2 == i + 1 && pi3 != i + 2) {
            swapNum = pi
            isSwap = true
            count++
            continue
        }
        isSwap = false
    }

    return count
}