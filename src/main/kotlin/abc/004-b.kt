package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = (0 until 4).map { (0 until 4).map { sc.next() }.joinToString("")  }
    println(problem004b(a))
}

fun problem004b(a: List<String>): String {
    val ans = Array(4) { Array(4) { '|' } }
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            ans[3 - j][3 - i] = a[j][i]
        }
    }
    return ans.map { it.joinToString(" ") }.joinToString("\n")
}