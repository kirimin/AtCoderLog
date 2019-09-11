package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    val y = sc.nextLong()
    println(problem083c(x, y))
}

fun problem083c(x: Long, y: Long): Int {
    val a = mutableListOf(x)
    while (a[a.size - 1] <= y) {
        a.add(a[a.size - 1] * 2)
    }
    a.removeAt(a.size - 1)
    return a.size
}