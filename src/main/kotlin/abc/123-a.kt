package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()
    val k = sc.nextInt()
    println(problem123a(a, b, c, d, e, k))
}

fun problem123a(a: Int, b: Int, c: Int, d: Int, e: Int, k: Int): String {
    return if (e - a <= k) "Yay!" else ":("
}