package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem126b(s))
}

fun problem126b(s: String): String {
    val front = s.take(2).toInt()
    val back = s.takeLast(2).toInt()
    return if (front !in 1..12 && back !in 1..12) "NA"
    else if (front !in 1..12 && back in 1..12) "YYMM"
    else if (front in 1..12 && back !in 1..12) "MMYY"
    else "AMBIGUOUS"
}