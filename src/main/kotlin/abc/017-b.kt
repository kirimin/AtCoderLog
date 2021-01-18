package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next()
    println(problem017b(x))
}

fun problem017b(x: String): String {
    var ans = "NO"
    fun search(s: String): String {
        if (s.isEmpty()) {
            ans = "YES"
            return ""
        }
        when (s.last()) {
            'o', 'k', 'u' -> {
                return search(s.dropLast(1))
            }
            else -> {
                if (s.takeLast(2) == "ch") {
                    return search(s.dropLast(2))
                }
            }
        }
        ans = "NO"
        return ""
    }
    search(x)
    return ans
}