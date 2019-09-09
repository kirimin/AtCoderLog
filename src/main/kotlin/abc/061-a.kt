package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem061a(a, b, c))
}

fun problem061a(a: Int, b: Int, c: Int): String {
    return if (c in a..b) {
        "Yes"
    } else {
        "No"
    }
}