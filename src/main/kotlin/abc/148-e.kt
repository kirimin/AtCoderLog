package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem148e(n))
}

fun problem148e(n: Long): String {
    if (n % 2 != 0L) return "0"
    var n = n / 2L
    var res = 0L
    while (n != 0L) {
        res += n / 5
        n /= 5
    }
    return res.toString()
}