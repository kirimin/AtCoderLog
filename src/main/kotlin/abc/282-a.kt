package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    println(problem282a(k))
}

fun problem282a(k: Int): String {
    val alphabets = ('A'..'Z').toList()
    return alphabets.take(k).joinToString("")
}