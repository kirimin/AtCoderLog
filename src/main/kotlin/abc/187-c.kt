package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem187c(n, s))
}

fun problem187c(n: Int, s: List<String>): String {
    val hash = s.toHashSet()
    for (i in 0 until n) {
        val si = s[i]
        if (hash.contains(si) && hash.contains("!$si")) return si
    }
    return "satisfiable"
}