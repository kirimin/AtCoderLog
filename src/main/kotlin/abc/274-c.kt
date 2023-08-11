package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem274c(n, a))
}

fun problem274c(n: Int, a: List<Int>): String {
    val amebas = IntArray(n * 2 + 2)
    amebas[1] = 0
    for (i in 0 until n) {
        val ai = a[i]
        val i = i + 1
        amebas[i * 2] = amebas[ai] + 1
        amebas[i * 2 + 1] = amebas[ai] + 1
    }
    return amebas.toList().drop(1).joinToString("\n")
}