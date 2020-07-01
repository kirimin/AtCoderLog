package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    println(problem108a(k))
}

fun problem108a(k: Int): Int {
    return (k / 2) * ((k + 1) / 2)
}