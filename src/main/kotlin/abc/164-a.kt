package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextInt()
    val w = sc.nextInt()
    println(problem164a(s, w))
}

fun problem164a(s: Int, w: Int): String {
    return if (s <= w) "unsafe" else "safe"
}