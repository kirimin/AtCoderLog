package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    println(problem302b(h, w, s))
}

fun problem302b(h: Int, w: Int, s: List<String>): String {
    val ans = mutableListOf<Pair<Int, Int>>()
    // 右
    for (i in 0 until h) {
        for (j in 0 until w - 4) {
            if (s[i][j] == 's' && s[i][j + 1] == 'n' && s[i][j + 2] == 'u' && s[i][j + 3] == 'k' && s[i][j + 4] == 'e') {
                ans.add(i + 1 to j + 1)
                ans.add(i + 1 to j + 2)
                ans.add(i + 1 to j + 3)
                ans.add(i + 1 to j + 4)
                ans.add(i + 1 to j + 5)
            }
        }
    }
    // 左
    for (i in 0 until h) {
        for (j in w - 1 downTo 4) {
            if (s[i][j] == 's' && s[i][j - 1] == 'n' && s[i][j - 2] == 'u' && s[i][j - 3] == 'k' && s[i][j - 4] == 'e') {
                ans.add(i + 1 to j + 1)
                ans.add(i + 1 to j)
                ans.add(i + 1 to j - 1)
                ans.add(i + 1 to j - 2)
                ans.add(i + 1 to j - 3)
            }
        }
    }
    // 下
    for (i in 0 until h - 4) {
        for (j in 0 until w) {
            if (s[i][j] == 's' && s[i + 1][j] == 'n' && s[i + 2][j] == 'u' && s[i + 3][j] == 'k' && s[i + 4][j] == 'e') {
                ans.add(i + 1 to j + 1)
                ans.add(i + 2 to j + 1)
                ans.add(i + 3 to j + 1)
                ans.add(i + 4 to j + 1)
                ans.add(i + 5 to j + 1)
            }
        }
    }
    // 上
    for (i in h - 1 downTo 4) {
        for (j in 0 until w) {
            if (s[i][j] == 's' && s[i - 1][j] == 'n' && s[i - 2][j] == 'u' && s[i - 3][j] == 'k' && s[i - 4][j] == 'e') {
                ans.add(i + 1 to j + 1)
                ans.add(i to j + 1)
                ans.add(i - 1 to j + 1)
                ans.add(i - 2 to j + 1)
                ans.add(i - 3 to j + 1)
            }
        }
    }
    // 右下
    for (i in 0 until h - 4) {
        for (j in 0 until w - 4) {
            if (s[i][j] == 's' && s[i + 1][j + 1] == 'n' && s[i + 2][j + 2] == 'u' && s[i + 3][j + 3] == 'k' && s[i + 4][j + 4] == 'e') {
                ans.add(i + 1 to j + 1)
                ans.add(i + 2 to j + 2)
                ans.add(i + 3 to j + 3)
                ans.add(i + 4 to j + 4)
                ans.add(i + 5 to j + 5)
            }
        }
    }
    // 左下
    for (i in 0 until h - 4) {
        for (j in w - 1 downTo 4) {
            if (s[i][j] == 's' && s[i + 1][j - 1] == 'n' && s[i + 2][j - 2] == 'u' && s[i + 3][j - 3] == 'k' && s[i + 4][j - 4] == 'e') {
                ans.add(i + 1 to j + 1)
                ans.add(i + 2 to j)
                ans.add(i + 3 to j - 1)
                ans.add(i + 4 to j - 2)
                ans.add(i + 5 to j - 3)
            }
        }
    }
    // 右上
    for (i in h - 1 downTo 4) {
        for (j in 0 until w - 4) {
            if (s[i][j] == 's' && s[i - 1][j + 1] == 'n' && s[i - 2][j + 2] == 'u' && s[i - 3][j + 3] == 'k' && s[i - 4][j + 4] == 'e') {
                ans.add(i + 1 to j + 1)
                ans.add(i to j + 2)
                ans.add(i - 1 to j + 3)
                ans.add(i - 2 to j + 4)
                ans.add(i - 3 to j + 5)
            }
        }
    }
    // 左上
    for (i in h - 1 downTo 4) {
        for (j in w - 1 downTo 4) {
            if (s[i][j] == 's' && s[i - 1][j - 1] == 'n' && s[i - 2][j - 2] == 'u' && s[i - 3][j - 3] == 'k' && s[i - 4][j - 4] == 'e') {
                ans.add(i + 1 to j + 1)
                ans.add(i to j)
                ans.add(i - 1 to j - 1)
                ans.add(i - 2 to j - 2)
                ans.add(i - 3 to j - 3)
            }
        }
    }
    return ans.map { "${it.first} ${it.second}" }.joinToString("\n")
}