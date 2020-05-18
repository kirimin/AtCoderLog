package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem168a(n))
}

fun problem168a(n: Int): String {
    return when(n.toString().last().toString()) {
        "2", "4", "5", "7", "9" -> "hon"
        "0", "1", "6", "8" -> "pon"
        "3" -> "bon"
        else -> ""
    }
}