package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next()
    println(problem226a(x))
}

fun problem226a(x: String): Int {
    val tmp = x.dropLast(2)
    return if (tmp.last().toString().toInt() >= 5) tmp.dropLast(2).toString().toInt() + 1 else tmp. dropLast(2).toString().toInt()
}