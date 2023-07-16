package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = (0 until n).map { sc.next() }
    println(problem295a(n, w))
}

fun problem295a(n: Int, w: List<String>): String {
    return if (w.contains("and") || w.contains("not") || w.contains("that") || w.contains("the") || w.contains("you")) "Yes" else "No"
}