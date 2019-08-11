package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextLong()
    val x = sc.nextLong()
    println(problem137b(k, x))
}

fun problem137b(k: Long, x: Long): String {
    return (x - k + 1 until x + k).joinToString( " ")
}