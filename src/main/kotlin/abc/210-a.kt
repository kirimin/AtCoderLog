package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem210a(n, a, x, y))
}

fun problem210a(n: Int, a: Int, x: Int, y: Int): Long {
    var sum = 0L
    for (i in 0 until n) {
        if (i < a) {
            sum += x
        } else {
            sum += y
        }
    }
    return sum
}