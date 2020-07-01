package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextInt()
    println(problem104a(r))
}

fun problem104a(r: Int): String {
    return if (r < 1200) "ABC" else if (r < 2800) "ARC" else "AGC"
}