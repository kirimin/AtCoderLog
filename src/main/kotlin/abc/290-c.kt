package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem290c(n, k, a))
}

fun problem290c(n: Int, k: Int, a: List<Long>): Long {
    val set = a.toSet()
    for (i in 0 .. k) {
        if (set.contains(i.toLong())) {
            continue
        } else {
            return i.toLong()
        }
    }
    return k.toLong()
}