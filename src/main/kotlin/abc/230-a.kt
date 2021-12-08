package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem230a(n))
}

fun problem230a(n: Int): String {
    if (n >= 42) {
        return "AGC0" + (n + 1)
    } else if (n < 10) {
        return "AGC00$n"
    } else {
        return "AGC0" + n
    }
}