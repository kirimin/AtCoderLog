package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val m = sc.nextInt()
    val d = (0 until m).map { sc.next().toInt() }
    println(problem315b(m, d))
}

fun problem315b(m: Int, d: List<Int>): String {
    val half = d.sum() / 2 + 1
    var count = 0
    for (i in 0 until m) {
        val di = d[i]
        for (j in 0 until di) {
            count++
            if (count == half) {
                return "${i + 1} ${j + 1}"
            }
        }
    }
    return ""
}