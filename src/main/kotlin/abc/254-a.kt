package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    println(problem254a(n))
}

fun problem254a(n: String): String {
    return n.drop(1)
}