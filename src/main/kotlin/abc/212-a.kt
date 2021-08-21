package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem212a(a, b))
}

fun problem212a(a: Int, b: Int): String {
    return if (a > 0 && b ==0) {
        "Gold"
    } else if (a == 0 && b > 1) {
        "Silver"
    } else {
        "Alloy"
    }
}