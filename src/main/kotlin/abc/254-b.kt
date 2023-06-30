package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem254b(n))
}

fun problem254b(n: Int): String {
    val a = Array(n) { IntArray(n + 1) }
    for (i in 0 until n) {
        for (j in 0 until i + 1) {
            if (j == 0 || j == i) {
                a[i][j] = 1
            } else {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j]
            }
        }
    }
    return a.map { it.filter { it != 0 } }.map { it.joinToString(" ") }.joinToString("\n")
}