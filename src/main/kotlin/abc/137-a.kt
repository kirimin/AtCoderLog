package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    var max = Math.max(a + b, a * b)
    max = Math.max(max, a - b)
    println(max)
}