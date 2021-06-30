package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem207a(a, b, c))
}

fun problem207a(a: Int, b: Int, c: Int): Int {
    return listOf(a, b, c).sorted().drop(1).sum()
}