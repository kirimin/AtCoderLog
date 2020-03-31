package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = (0 until n).map { sc.next() }
    println(problem109b(n, w))
}

fun problem109b(n: Int, w: List<String>): String {
    if (w.toSet().size != w.size) {
        return "No"
    }
    for (i in 1 until n) {
        if (w[i].first() != w[i - 1].last()) {
            return "No"
        }
    }
    return "Yes"
}