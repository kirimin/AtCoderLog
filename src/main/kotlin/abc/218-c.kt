package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    val t = (0 until n).map { sc.next() }
    println(problem218c(n, s, t))
}

fun problem218c(n: Int, s: List<String>, t: List<String>): String {
    fun func(g: Array<Array<String>>): Array<Array<String>> {
        val g2 = Array(n) { Array(n) {"."} }
        var isTop = true
        var top = -1
        for (i in 0 until n) {
            if (isTop && g[i].contains("#")) {
                isTop = false
                top = 0
            }
            if (top == -1) continue
            for (j in 0 until n) {
                g2[top][j] = g[i][j].toString()
            }
            top++
        }
        val g3 = Array(n) { Array(n) {"."} }
        var isLeft = true
        var left = -1
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (isLeft && g2[j][i] == "#") {
                    isLeft = false
                    left = i
                    break
                }
            }
            if (!isLeft) break
        }
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (j + left >= n) break
                g3[i][j] = g2[i][j + left]
            }
        }
//        debugLog(g3.map {  "\n" + it.joinToString("") })
        return g3
    }

    var s = s.map { it.map { it.toString() }.toTypedArray() }.toTypedArray()
    var t = t.map { it.map { it.toString() }.toTypedArray() }.toTypedArray()
    s = func(s)
    t = func(t)
    fun isMatch(a: Array<Array<String>>, b: Array<Array<String>>): Boolean {
        var isMatch = true
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (a[i][j] != b[i][j]) isMatch = false
            }
        }
        return isMatch

    }
    if (isMatch(s, t)) return "Yes"

    var t2 = Array(n) { Array(n) {"."} }
    for (i in 0 until n) {
        for (j in 0 until n) {
            t2[i][j] = t[n - j - 1][i]
        }
    }
    t2 = func(t2)
    if (isMatch(s, t2)) return "Yes"

    var t3 = Array(n) { Array(n) {"."} }
    for (i in 0 until n) {
        for (j in 0 until n) {
            t3[i][j] = t[n - i - 1][n - j - 1]
        }
    }
    t3 = func(t3)
    if (isMatch(s, t3)) return "Yes"

    var t4 = Array(n) { Array(n) {"."} }
    for (i in 0 until n) {
        for (j in 0 until n) {
            t4[i][j] = t[j][n - i - 1]
        }
    }
    t4 = func(t4)
    if (isMatch(s, t4)) return "Yes"

    return "No"
}