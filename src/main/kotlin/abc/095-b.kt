package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem095b(s))
}

fun problem095b(s: String): Int {
    var price = 700
    if (s[0] == 'o') price += 100
    if (s[1] == 'o') price += 100
    if (s[2] == 'o') price += 100
    return price
}