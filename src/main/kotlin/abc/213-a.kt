package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem213a(a, b))
}

fun problem213a(a: Int, b: Int): Int {
    for (c in 1..255) {
        if (a xor c == b) return c
    }
    return 0
}