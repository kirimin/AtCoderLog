package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem282c(n, s))
}

fun problem282c(n: Int, s: String): String {
    val ans = ArrayDeque<String>()
    var flag = false
    for (i in 0 until n) {
        if (s[i] == '"') {
            flag = !flag
        }
        if (s[i] == ',' && !flag) {
            ans += "."
        } else {
            ans += s[i].toString()
        }
    }
    return ans.joinToString("")
}