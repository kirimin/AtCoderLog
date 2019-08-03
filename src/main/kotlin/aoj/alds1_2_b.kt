package aoj

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val a = (0 until n).map { sc.next().toInt() }.toMutableList()

    // 選択ソート
    var count = 0
    (0 until n).forEach { i ->
        var minj = i
        (i until n).forEach { j ->
            if (a[j] < a[minj]) {
                minj = j
            }
        }
        val tmp = a[i]
        a[i] = a[minj]
        a[minj] = tmp
        count++
    }
    println(count)
    println(a.joinToString(" "))
}