package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val x = sc.nextInt()
    println(problem242a(a, b, c, x))
}

fun problem242a(a: Int, b: Int, c: Int, x: Int): Double {
    if (x <= a) {
        return 1.0
    }
    if (x > b) {
        return 0.0
    }
    val bosu = (b) - a
    return c / bosu.toDouble()
}