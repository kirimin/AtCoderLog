package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem311a(n, s))
}

fun problem311a(n: Int, s: String): Int {
    var a = false
    var b = false
    var c = false
    for (i in 0 until n) {
        if (s[i] == 'A') a = true
        if (s[i] == 'B') b = true
        if (s[i] == 'C') c = true
        if (a && b && c) return i + 1
    }
    return 0
}