package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem090b(a, b))
}

fun problem090b(a: Int, b: Int): Int {
    var count = 0
    for (i in a..b) {
        val str = i.toString()
        if (str[0] == str[4] && str[1] == str[3]) count++
    }
    return count
}