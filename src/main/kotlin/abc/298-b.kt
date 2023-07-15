package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { (0 until n).map { sc.next().toInt() } }
    val b = (0 until n).map { (0 until n).map { sc.next().toInt() } }
    println(problem298b(n, a, b))
}

fun problem298b(n: Int, a: List<List<Int>>, b: List<List<Int>>): String {
    val a2 = a.map { it.toMutableList() }.toMutableList()
    var ans = "Yes"
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (a2[i][j] == 1 && b[i][j] != 1) {
                ans = "No"
            }
        }
    }
    if (ans == "Yes") return ans
    ans = "Yes"
    // a2を90度回転
    for (i in 0 until n) {
        for (j in 0 until n) {
            a2[i][j] = a[n - j - 1][i]
        }
    }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (a2[i][j] == 1 && b[i][j] != 1) {
                ans = "No"
            }
        }
    }
    if (ans == "Yes") return ans
    ans = "Yes"
    // a2を180度回転
    for (i in 0 until n) {
        for (j in 0 until n) {
            a2[i][j] = a[n - i - 1][n - j - 1]
        }
    }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (a2[i][j] == 1 && b[i][j] != 1) {
                ans = "No"
            }
        }
    }
    if (ans == "Yes") return ans
    ans = "Yes"
    // a2を270度回転
    for (i in 0 until n) {
        for (j in 0 until n) {
            a2[i][j] = a[j][n - i - 1]
        }
    }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (a2[i][j] == 1 && b[i][j] != 1) {
                ans = "No"
            }
        }
    }
    if (ans == "Yes") return ans
    return ans
}