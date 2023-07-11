package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem285a(a, b))
}

fun problem285a(a: Int, b: Int): String {
    return if (b / 2 == a) "Yes" else "No"
}