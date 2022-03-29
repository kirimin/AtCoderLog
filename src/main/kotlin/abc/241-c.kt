package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem241c(n, s))
}

fun problem241c(n: Int, s: List<String>): String {
    for (i in 0 until n) {
        for (j in 0 until n - 5) {
            val s1 = s[i][j]
            val s2 = s[i][j + 1]
            val s3 = s[i][j + 2]
            val s4 = s[i][j + 3]
            val s5 = s[i][j + 4]
            val s6 = s[i][j + 5]
            val list = listOf(s1, s2, s3, s4, s5, s6)
            if (list.count { it == '#' } >= 4) {
                return "Yes"
            }
        }
    }
    for (i in 0 until n - 5) {
        for (j in 0 until n) {
            val s1 = s[i][j]
            val s2 = s[i + 1][j]
            val s3 = s[i + 2][j]
            val s4 = s[i + 3][j]
            val s5 = s[i + 4][j]
            val s6 = s[i + 5][j]
            val list = listOf(s1, s2, s3, s4, s5, s6)
            if (list.count { it == '#' } >= 4) {
                return "Yes"
            }
        }
    }
    for (i in 0 until n - 5) {
        for (j in 0 until n - 5) {
            val s1 = s[i][j]
            val s2 = s[i + 1][j + 1]
            val s3 = s[i + 2][j + 2]
            val s4 = s[i + 3][j + 3]
            val s5 = s[i + 4][j + 4]
            val s6 = s[i + 5][j + 5]
            val list = listOf(s1, s2, s3, s4, s5, s6)
            if (list.count { it == '#' } >= 4) {
                return "Yes"
            }
        }
    }
    for (i in 0 until n - 5) {
        for (j in 0 until n - 5) {
            val s1 = s[i][j + 5]
            val s2 = s[i + 1][j + 4]
            val s3 = s[i + 2][j + 3]
            val s4 = s[i + 3][j + 2]
            val s5 = s[i + 4][j + 1]
            val s6 = s[i + 5][j + 0]
            val list = listOf(s1, s2, s3, s4, s5, s6)
            if (list.count { it == '#' } >= 4) {
                return "Yes"
            }
        }
    }
    return "No"
}