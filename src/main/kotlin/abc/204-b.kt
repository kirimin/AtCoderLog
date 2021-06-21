package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem204b(n, a))
}

fun problem204b(n: Int, a: List<Int>): Long {
    var sum = 0L
    for (i in 0 until n) {
        val ai = a[i]
        if (ai > 10) {
            sum += ai - 10
        }
    }
    return sum
}