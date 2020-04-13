package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val i = sc.nextInt()
    println(problem107a(n, i))
}

fun problem107a(n: Int, i: Int): Int {
    return n - i + 1
}