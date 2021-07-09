package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextLong()
    println(problem174c(k))
}

fun problem174c(k: Long): Int {
    val a = LongArray(10000)
    a[1] = 7 % k

    for (i in 2..k.toInt()) {
        a[i] = (a[i - 1] * 10 + 7) % k
    }

    for (i in 1..k.toInt()) {
        if (a[i] == 0L) {
            return i
        }
    }
    return -1
}