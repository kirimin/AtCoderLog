package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val k = sc.nextLong()
    println(problem149b(a, b, k))
}

fun problem149b(a: Long, b: Long, k: Long): String {
    val takagi = a - k
    if (takagi < 0) {
        return "0 " + Math.max(0, b - (k - a))
    } else {
        return "${a - k} $b"
    }
}