package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem073a(n))
}

fun problem073a(n: Int): String {
    return when {
        n == 9 -> "Yes"
        n > 88 -> "Yes"
        n.toString().takeLast(1) == "9" -> "Yes"
        else -> "No"
    }
}