package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem222b(n, p, a))
}

fun problem222b(n: Int, p: Int, a: List<Int>): Int {
    var count = 0
    for (i in 0 until n) {
        if (a[i] < p) count++
    }
    return count
}