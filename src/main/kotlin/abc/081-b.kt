package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem081b(n, a))
}

fun problem081b(n: Long, a: List<Long>): Long {
    val a = a.toMutableList()
    var count = 0L
    while (true) {
        var flg = false
        for (i in 0 until a.size) {
            if (a[i] % 2 == 0L) {
                a[i] = a[i] / 2
            } else {
                flg = true
                break
            }
        }
        if (flg) break
        count++
    }
    return count
}