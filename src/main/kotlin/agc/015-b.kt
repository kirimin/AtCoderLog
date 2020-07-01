package agc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem015b(s))
}

fun problem015b(s: String): Long {
    var sum = 0L
    for (i in 0 until s.length) {
        val si = s[i]
        if (si == 'U') {
            sum += i * 2
            sum += s.length - (i + 1)
        } else {
            sum += i
            sum += (s.length - (i + 1)) * 2
        }
    }
    return sum
}