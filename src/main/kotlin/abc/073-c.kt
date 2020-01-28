package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem073c(n, a))
}

fun problem073c(n: Int, a: List<Long>): Int {
    val a = a.toLongArray()
    val set = hashSetOf<Long>()
    for (i in 0 until n) {
        val ai = a[i]
        if (set.contains(ai)) {
            set.remove(ai)
        } else {
            set.add(ai)
        }
    }
    return set.count()
}