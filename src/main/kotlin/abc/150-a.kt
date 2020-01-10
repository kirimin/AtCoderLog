package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    val x = sc.nextInt()
    println(problem150a(k, x))
}

fun problem150a(k: Int, x: Int): String {
    return if (k * 500 >= x) "Yes" else "No"
}