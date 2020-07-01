package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem119a(s))
}

fun problem119a(s: String): String {
    return if (s.take(4).toInt() >= 2019 && s.drop(5).take(2).toInt() >= 5) "TBD" else "Heisei"
}