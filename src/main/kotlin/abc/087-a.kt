package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem087a(x, a, b))
}

fun problem087a(x: Int, a: Int, b: Int): Int {
    val tmp = x - a
    return tmp % b
}