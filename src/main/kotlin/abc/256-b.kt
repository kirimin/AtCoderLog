package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem256b(n, a))
}

fun problem256b(n: Int, a: List<Int>): Long {
    var p = 0L
    val math = BooleanArray(4) { false }
    for (i in 0 until n) {
        val ai = a[i]
        math[0] = true
        for (j in 3 downTo  0) {
            if (math[j]) {
                math[j] = false
                val tmp = ai + j
                if (tmp <= 3) {
                    math[tmp] = true
                } else {
                    p++
                }
            }
        }
    }
    return p
}