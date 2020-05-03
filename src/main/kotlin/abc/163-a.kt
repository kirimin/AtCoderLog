package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val R = sc.nextInt()
    println(problem163a(R))
}

fun problem163a(r: Int): Double {
    return 2 * 3.141592653589793 * r
}