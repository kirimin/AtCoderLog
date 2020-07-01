package abc

import java.lang.Exception
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem169b(n, a))
}

fun problem169b(n: Int, a: List<Long>): Long {
    if(a.contains(0)) return 0
    var multi = 1L
    for (i in 0 until n) {
        try {
            multi = Math.multiplyExact(multi, a[i])
        } catch (e : Exception) {
            return -1
        }
    }
    return if (multi > 1000000000000000000L) -1 else multi.toLong()
}