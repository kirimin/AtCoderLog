package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next().toCharArray() }
    println(problem297c(h, w, s))
}

fun problem297c(h: Int, w: Int, s: List<CharArray>): String {
    var ans = s.toMutableList()
    var put = false
    for (i in 0 until h) {
        for (j in 0 until w - 1) {
            if (ans[i][j] == 'T' && ans[i][j + 1] == 'T') {
                ans[i][j] = 'P'
                ans[i][j + 1] = 'C'
            }
        }
    }
    return ans.map { it.joinToString("") }.joinToString("\n")
}