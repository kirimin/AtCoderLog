package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem162a(n))
}

fun problem162a(n: Int): String {
    return if (n.toString().toCharArray().contains('7')) "Yes" else "No"
}