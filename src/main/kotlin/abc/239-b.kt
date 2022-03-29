package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    println(problem239b(x))
}

fun problem239b(x: Long): Long {
    return if (x / 10.0 >= 0) x / 10 else x / 10 + if(x % 10 != 0L) - 1 else 0
}