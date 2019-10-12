package abc

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem066c(n, a))
}

fun problem066c(n: Int, a: List<Long>): String {
    val b = LinkedList<Long>()
    for (i in 0 until n) {
        if (n % 2 == 0) {
            if (i % 2 != 0) {
                b.add(0, a[i])
            } else {
                b.add(a[i])
            }
        } else {
            if (i % 2 != 0) {
                b.add(a[i])
            } else {
                b.add(0, a[i])
            }
        }
    }
    val sb = StringBuilder()
    b.forEach {
        sb.append("$it ")
    }
    return sb.toString()
}