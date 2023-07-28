package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { (0 until w).map { sc.next().toInt() } }
    println(problem294b(h, w, a))
}

fun problem294b(h: Int, w: Int, a: List<List<Int>>): String {
    val alphabets = ('A'..'Z').toList()
    val ans = Array(h) { CharArray(w) }
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (a[i][j] == 0) {
                ans[i][j] = '.'
            } else {
                ans[i][j] = alphabets[a[i][j].toString().toInt() - 1]
            }
        }
    }
    return ans.map { it.joinToString("") }.joinToString("\n")
}