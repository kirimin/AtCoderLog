package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val s = sc.next()
    println(problem084b(a, b, s))
}

fun problem084b(a: Int, b: Int, s: String): String {
    val regex = Regex("[0-9]+")
    return if (s.length == a + b + 1 && s[a] == '-' && regex.matches(s.take(a) + s.takeLast(b))) "Yes" else "No"
}