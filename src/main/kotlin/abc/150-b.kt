package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem150b(n, s))
}

fun problem150b(n: Int, s: String): Int {
    var count = 0
    for (i in 0 until n - 2) {
        if ((s[i].toString() + s[i + 1] + s[i + 2]) == "ABC") count++
    }
    return count
}