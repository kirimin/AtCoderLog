package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem240a(a, b))
}

fun problem240a(a: Int, b: Int): String {
    if (a == 10 && b == 1 || a == 1 && b == 10) {
        return "Yes"
    }
    return if (Math.abs(a - b) == 1) "Yes" else "No"
}