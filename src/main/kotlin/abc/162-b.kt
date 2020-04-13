package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem162b(n))
}

fun problem162b(n: Int): Long {
    var sum = 0L
    for (i in 1..n) {
        if (i % 3 == 0 || i % 5 == 0) continue
        sum += i
    }
    return sum
}