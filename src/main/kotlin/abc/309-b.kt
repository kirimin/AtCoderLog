package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toCharArray() }
    println(problem309b(n, a))
}

fun problem309b(n: Int, a: List<CharArray>): String {
    val ans = Array<CharArray>(n) { CharArray(n) }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == 0 && j != n - 1) {
                ans[i][j + 1] = a[i][j]
            } else if (j == n - 1 && i != n - 1) {
                ans[i + 1][j] = a[i][j]
            } else if (i == n - 1 && j != 0) {
                ans[i][j - 1] = a[i][j]
            } else if (j == 0 && i != 0) {
                ans[i - 1][j] = a[i][j]
            } else {
                ans[i][j] = a[i][j]
            }
        }
    }
    return ans.map { it.joinToString("") }.joinToString("\n")
}