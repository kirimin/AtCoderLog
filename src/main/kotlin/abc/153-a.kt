package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val a = sc.nextInt()
    println(problem153a(h, a))
}

fun problem153a(h: Int, a: Int): Int {
    return h / a + if (h % a != 0) 1 else 0
}