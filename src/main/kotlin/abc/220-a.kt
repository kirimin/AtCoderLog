package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem220a(a, b, c))
}

fun problem220a(a: Int, b: Int, c: Int): Int {
    var ans = c
    while (ans <= b) {
        if (ans in a..b) return ans
        ans += c
    }
    return -1
}