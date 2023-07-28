package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem011b(s))
}

fun problem011b(s: String): String {
    val map = mutableMapOf<String, Int>()
    for (i in 0 until s.length - 1) {
        val str = s[i].toString() + s[i + 1].toString()
        map[str] = (map[str] ?: 0) + 1
    }
    return map.toList().sortedBy { it.first }.sortedByDescending { it.second }.first().first
}