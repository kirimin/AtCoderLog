package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h1 = sc.nextInt()
    val w1 = sc.nextInt()
    val h2 = sc.nextInt()
    val w2 = sc.nextInt()
    println(problem038b(h1, w1, h2, w2))
}

fun problem038b(h1: Int, w1: Int, h2: Int, w2: Int): String {
    return if (h1 == h2 || h1 == w2 || h2 == w1 || w1 == w2) "YES" else "NO"
}
