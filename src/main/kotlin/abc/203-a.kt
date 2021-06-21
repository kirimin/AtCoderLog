package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem203a(a, b, c))
}

fun problem203a(a: Int, b: Int, c: Int): Int {
    return if (a == b) {
        c
    } else if (b == c) {
        a
    } else if (a == c) {
        b
    } else {
        0
    }
}