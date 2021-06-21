package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem206a(n))
}

fun problem206a(n: Int): String {
    val price = (1.08 * n).toInt()
    return if (price < 206) "Yay!" else if (price == 206) "so-so" else ":("
}