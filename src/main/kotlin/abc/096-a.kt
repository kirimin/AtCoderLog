package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem096a(a, b))
}

fun problem096a(a: Int, b: Int): Int {
    return if (a > 12) return 12 else (a - 1) + if (a <= b) 1 else 0
}