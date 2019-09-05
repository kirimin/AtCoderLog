package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    println(problem086b(a, b))
}

fun problem086b(a: String, b: String): String {
    val num = (a + b).toInt()
    for (i in 1 until num) {
        if (num / i == i && num % i == 0) {
            return "Yes"
        }
    }
    return "No"
}