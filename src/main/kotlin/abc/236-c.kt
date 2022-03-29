package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    val t = (0 until m).map { sc.next() }
    println(problem236c(n, m, s, t))
}

fun problem236c(n: Int, m: Int, s: List<String>, t: List<String>): String {
    val ans = mutableListOf<String>()
    var j = 0
    for (i in 0 until n) {
        val si = s[i]
        val tj = t[j]
        if (si == tj) {
            j++
            ans.add("Yes")
        } else {
            ans.add("No")
        }
    }
    return ans.joinToString("\n")
}
