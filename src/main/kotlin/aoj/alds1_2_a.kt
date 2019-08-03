package aoj

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val a = (0 until n).map { sc.next().toInt() }.toMutableList()

    // バブルソート
    var i = 1
    var count = 0
    while (true) {
        (i until n).reversed().forEach { j ->
            if (a[j] < a[j - 1]) {
                val tmp = a[j]
                a[j] = a[j - 1]
                a[j - 1] = tmp
                count++
            }
        }
        i++
        if (i == n) break
    }
    println(a.joinToString(" "))
    println(count)
}