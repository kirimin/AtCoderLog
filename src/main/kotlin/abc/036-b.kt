package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next().toCharArray() }
    println(problem036b(n, s))
}

fun problem036b(n: Int, s: List<CharArray>): String {
    val ans = Array(n) { Array(n) { '_' } }
    for (i in 0 until n) {
        for (j in 0 until n) {
            ans[j][n - i - 1] = s[i][j]
        }
    }
    return ans.map { it.joinToString("") }.joinToString("\n")
}