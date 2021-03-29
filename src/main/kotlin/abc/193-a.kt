package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem193a(a, b))
}

fun problem193a(a: Int, b: Int): Double {
    return 100 - (b.toDouble() / a) * 100
}