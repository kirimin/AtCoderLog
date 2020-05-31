package abc

import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next().toCharArray() }
    println(problem075b(h, w, s))
}

fun problem075b(h: Int, w: Int, s: List<CharArray>): String {
    val ans = Array(h) { Array(w) { "0" } }
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (s[i][j] != '#') {
                continue
            }
            ans[i][j] = "#"
            try {
                if (i != 0) ans[i - 1][j] = (ans[i - 1][j].toInt() + 1).toString()
            } catch (e: NumberFormatException) {
            }
            try {
                if (j != 0) ans[i][j - 1] = (ans[i][j - 1].toInt() + 1).toString()
            } catch (e: NumberFormatException) {
            }
            try {
                if (i != 0 && j != 0) ans[i - 1][j - 1] = (ans[i - 1][j - 1].toInt() + 1).toString()
            } catch (e: NumberFormatException) {
            }
            try {
                if (i != h - 1) ans[i + 1][j] = (ans[i + 1][j].toInt() + 1).toString()
            } catch (e: NumberFormatException) {
            }
            try {
                if (j != w - 1) ans[i][j + 1] = (ans[i][j + 1].toInt() + 1).toString()
            } catch (e: NumberFormatException) {
            }
            try {
                if (i != h - 1 && j != w - 1) ans[i + 1][j + 1] = (ans[i + 1][j + 1].toInt() + 1).toString()
            } catch (e: NumberFormatException) {
            }
            try {
                if (i != 0 && j != w - 1) ans[i - 1][j + 1] = (ans[i - 1][j + 1].toInt() + 1).toString()
            } catch (e: NumberFormatException) {
            }
            try {
                if (i != h - 1 && j != 0) ans[i + 1][j - 1] = (ans[i + 1][j - 1].toInt() + 1).toString()
            } catch (e: NumberFormatException) {
            }
        }
    }
    return ans.map { it.joinToString("") }.joinToString("\n")
}