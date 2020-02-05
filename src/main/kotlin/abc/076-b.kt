package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    println(problem076b(n, k))
}

fun problem076b(n: Int, k: Int): Int {
    var res = 1
    for (i in 0 until n) {
        if (res > k) {
            res += k
        } else {
            res *= 2
        }
    }
    return res
}