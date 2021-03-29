package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem192a(x))
}

fun problem192a(x: Int): Int {
    return 100 - x % 100
}