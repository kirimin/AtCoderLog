package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem008a(a, b, c, d))
}

fun problem008a(a: Int, b: Int, c: Int, d: Int): Int {
    return Math.min(a + b - c, d)
}