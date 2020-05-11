package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem114a(x))
}

fun problem114a(x: Int): String {
    return when (x) {
        3,5,7 -> "YES"
        else -> "NO"
    }
}