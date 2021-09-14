package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem069d(h, w, n, a))
}

fun problem069d(h: Int, w: Int, n: Int, a: List<Int>): String {
    val ans = Array(h) { IntArray(w) { 0 } }
    var i = 0
    var j = a[i]
    for (y in 0 until h) {
        if (y % 2 == 0) {
            for (x in 0 until w) {
                ans[y][x] = i + 1
                j--
                if (j == 0) {
                    i++
                    if (i < n) {
                        j = a[i]
                    }
                }
            }
        } else {
            for (x in w - 1 downTo 0) {
                ans[y][x] = i + 1
                j--
                if (j == 0) {
                    i++
                    if (i < n) {
                        j = a[i]
                    }
                }
            }
        }
    }
    return ans.map { it.joinToString(" ") }.joinToString("\n")
}