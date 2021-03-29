package abc

import utilities.MathSample
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem193c(n))
}

fun problem193c(n: Long): Long {
    val v = HashSet<Long>()
    v.add(1)

    var i = 2L
    while (i * i <= n) {
        var j = i * i
        v.add(j)
        while (j * i <= n) {
            v.add(j * i)
            j *= i
        }
        i++
    }
    return n - v.size + 1
}