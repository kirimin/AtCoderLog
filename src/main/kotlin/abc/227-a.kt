package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = sc.nextInt()
    println(problem227a(n, k, a))
}

fun problem227a(n: Int, k: Int, a: Int): Int {
    var current = a - 1
    var k = k
    while (k != 0) {
        current++
        if (current > n) current = 1
        k--
    }
    return current
}