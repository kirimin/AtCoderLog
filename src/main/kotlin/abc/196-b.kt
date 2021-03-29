package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next()
    println(problem196b(x))
}

fun problem196b(x: String): String {
    if (x.indexOf('.') == -1) return x
    return x.take(x.indexOf('.'))
}