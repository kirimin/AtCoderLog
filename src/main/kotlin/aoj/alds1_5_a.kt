package aoj

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val a = (0 until n).map { sc.next().toInt() }.toMutableList()
    val q = sc.next().toInt()
    val m = (0 until q).map { sc.next().toInt() }.toMutableList()

    fun solve(i: Int, m: Int): Boolean {
        if (m == 0) {
            return true
        }
        if (i >= n) {
            return false
        }
        return solve(i + 1, m) || solve(i + 1, m - a[i])
    }

    m.forEachIndexed { i, mi ->
        if (solve(0, m[i])) println("Yes") else println("No")
    }
}