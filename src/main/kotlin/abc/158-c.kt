package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem158c(a, b))
}

fun problem158c(a: Int, b: Int): Int {
    val min = Integer.MAX_VALUE
    for (i in 1 until 10000) {
        if ((i * 0.08).toInt() == a && (i * 0.1).toInt() == b) return i
    }
    return -1
}