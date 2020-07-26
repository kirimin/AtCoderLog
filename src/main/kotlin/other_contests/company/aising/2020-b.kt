package other_contests.company.aising

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem2020b(n, a))
}

fun problem2020b(n: Int, a: List<Int>): Int {
    var count = 0
    for (i in 0 until n) {
        val ai = a[i]
        if ((i + 1) % 2 != 0 && ai % 2 != 0) count++
    }
    return count
}