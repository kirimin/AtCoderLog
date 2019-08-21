package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val s = sc.next()
    println(problem138a(a, s))
}

fun problem138a(a: Int, s: String): String {
    return if (a >= 3200) s else "red"
}