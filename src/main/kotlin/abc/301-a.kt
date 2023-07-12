package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem301a(n, s))
}

fun problem301a(n: Int, s: String): String {
    val t = s.count { it == 'T' }
    val a = s.count { it == 'A' }
    if (t == a) {
        var countT = 0
        var countA = 0
        for (i in 0 until n) {
            if (s[i] == 'T') countT++
            else countA++
            if (countA == a) return "A"
            if (countT == t) return "T"
        }
    }
    return if (t > a) "T" else "A"
}