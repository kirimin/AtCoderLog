package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem148d(n, a))
}

fun problem148d(n: Int, a: List<Int>): Int {
    var current = 1
    var count = 0
    for (i in 0 until n) {
        if (a[i] != current) {
            count++
        } else {
            current++
        }
    }
    if (count == n) return -1
    return count
}