package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem55b(n))
}

fun problem55b(n: Long): Long {
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
    var answer = 1L
    (1..n).forEach { i ->
        answer *= i
        answer %= mod
    }
    return answer
}