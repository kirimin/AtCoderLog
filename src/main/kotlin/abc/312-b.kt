package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem312b(n, m, s))
}

fun problem312b(n: Int, m: Int, s: List<String>): String {
    val list = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until n) {
        for (j in 0 until m) {
            var isOK = true
            try {
                for (k in i until i + 9) {
                    for (l in j until j + 9) {
                        if (k <= i + 2 && l <= j + 2) {
                            if (s[k][l] != '#') {
                                isOK = false
                            }
                        } else if (k >= i + 6 && l >= j + 6 && k <= i + 8 && l <= j + 8) {
                            if (s[k][l] != '#') {
                                isOK = false
                            }
                        } else if (k <= i + 3 && l <= j + 3) {
                            if (s[k][l] == '#') {
                                isOK = false
                            }
                        } else if (k >= i + 5 && l >= j + 5) {
                            if (s[k][l] == '#') {
                                isOK = false
                            }
                        }
                    }
                }
                if (isOK) {
                    list.add(Pair(i + 1, j + 1))
                }
            } catch (e: Exception) {
            }
        }
    }
    return list.sortedWith(compareBy({ it.first }, { it.second })).joinToString("\n") { "${it.first} ${it.second}" }
}