package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val c = sc.next()
    println(problem151a(c))
}

fun problem151a(c: String): Char {
    return c.toCharArray()[0] + 1
}