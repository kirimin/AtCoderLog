package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem236a(s, a, b))
}

fun problem236a(s: String, a: Int, b: Int): String {
    val s = s.toCharArray()
    val tmp = s[b - 1]
    s[b - 1] = s[a - 1]
    s[a - 1] = tmp
    return s.joinToString("")
}