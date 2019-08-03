package aoj

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val a = (0 until n).map { sc.next().toInt() }.toMutableList()

    // 挿入ソート
    a.forEach { i ->
        if (a[i] == 0) return@forEach
        var j = i - 1
        while (j >= 0 && a[j] > a[i]) {
            a[j + 1] = a[j]
            j--
        }
        a[j + 1] = a[i]
        println(a.joinToString(" "))
    }
}