package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val m = sc.nextInt()
    val h = sc.nextInt()
    println(problem195a(m, h))
}

fun problem195a(m: Int, h: Int): String {
    return if (h % m == 0) "Yes" else "No"
}