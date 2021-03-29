package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem194a(a, b))
}

fun problem194a(a: Int, b: Int): Int {
    return if (a + b >= 15 && b >= 8) {
        1
    } else if (a + b >= 10 && b >= 3) {
        2
    } else if (a + b >= 3) {
        3
    } else {
        4
    }
}