package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    println(problem171a(a))
}

fun problem171a(a: String): String {
    return if (a[0] in 'a'..'z') "a" else "A"
}