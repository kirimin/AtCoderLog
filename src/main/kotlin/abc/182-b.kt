package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem182b(n, a))
}

fun problem182b(n: Int, a: List<Int>): Int {
    var max = 0
    var ans = 0
    for (i in 1000 downTo 2) {
        var gcd = 0
        for (j in 0 until n) {
            val aj = a[j]
            if (aj % i == 0) gcd++
        }
        if (gcd > max) {
            ans = i
        }
        max = Math.max(gcd, max)
    }
    return ans
}