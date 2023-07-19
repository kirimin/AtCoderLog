package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem293a(s))
}

fun problem293a(s: String): String {
    val ans = charArrayOf(' ') + s.toCharArray()
    for (i in 1 until s.length / 2 + 1) {
        // swap
        val tmp = ans[i * 2 - 1]
        ans[i * 2 - 1] = ans[i * 2]
        ans[i * 2] = tmp
    }
    return ans.joinToString("").drop(1)
}