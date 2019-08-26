package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val y = sc.nextLong()
    println(problem085c(n, y))
}

fun problem085c(n: Int, y: Long): String {
    for (i in 0..n) {
        for (j in 0..n) {
            if (i + j > n) break
            val k = n - i - j
            if (i + j + k == n && i * 10000L + j * 5000L + 1000L * k == y) {
                return "$i $j $k"
            }
        }
    }
    return "-1 -1 -1"
}