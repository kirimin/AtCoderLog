package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val d = sc.nextInt()
    println(problem115a(d))
}

fun problem115a(d: Int): String {
    var result = "Christmas"
    if (d <= 24) result += " Eve"
    if (d <= 23) result += " Eve"
    if (d <= 22) result += " Eve"
    return result
}