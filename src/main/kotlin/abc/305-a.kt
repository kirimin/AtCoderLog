package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem305a(n))
}

fun problem305a(n: Int): Int {
    return if (n % 5 >= 3) n / 5 * 5 + 5 else n / 5 * 5
}