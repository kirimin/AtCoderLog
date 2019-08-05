package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem136b(n))
}

fun problem136b(n: Long): Int {
    return (1..n).count { i ->
        i.toString().length % 2 != 0
    }
}