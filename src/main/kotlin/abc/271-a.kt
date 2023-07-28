package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem271a(n))
}

fun problem271a(n: Int): String? {
    var hex = Integer.toHexString(n)
    if (hex.length == 1) hex = "0$hex"
    return hex.toUpperCase()
}