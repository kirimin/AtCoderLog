package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next()
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem219c(x, n, s))
}

fun problem219c(x: String, n: Int, s: List<String>): String {
    val map = mutableMapOf<Char, Char>()
    val alf = ('a'..'z').toList()
    for (i in 0 until x.length) {
        map.put(x[i], alf[i])
    }
    val ans = mutableListOf<Pair<String, String>>()
    for (i in 0 until n) {
        val si = s[i]
        var str = ""
        for (c in si) {
            str += map[c]
        }
        ans.add(str to si)
    }
    return ans.sortedBy { it.first }.map { it.second }.joinToString("\n")
}