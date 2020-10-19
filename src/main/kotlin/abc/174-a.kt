package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem174a(x))
}

fun problem174a(x: Int): String {
    return if (x >= 30) "Yes" else "No"
}