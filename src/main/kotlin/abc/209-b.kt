package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem209b(n, x, a))
}

fun problem209b(n: Int, x: Int, a: List<Int>): String {
    var x = x
    for (i in 0 until n) {
        val ai = a[i]
        if ((i + 1) % 2 == 0) {
            x -= ai - 1
        } else {
            x -= ai
        }
        if (x < 0) return "No"
    }
    return "Yes"
}