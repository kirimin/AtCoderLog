package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val k = sc.nextLong()
    println(problem106c(s, k))
}

fun problem106c(s: String, k: Long): Int {
    for (i in s.indices) {
        if (s[i] == '1' && i + 1 >= k) return 1
        val si = s[i]
        if (si != '1') return si.toString().toInt()
    }
    return 1
}