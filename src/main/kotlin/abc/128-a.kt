package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val p = sc.nextInt()
    println(problem128a(a, p))
}

fun problem128a(a: Int, p: Int): Int {
    return (a * 3 + p) / 2
}