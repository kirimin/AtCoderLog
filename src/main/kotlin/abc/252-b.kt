package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val b = (0 until k).map { sc.next().toInt() }
    println(problem252b(n, k, a, b))
}

fun problem252b(n: Int, k: Int, a: List<Int>, b: List<Int>): String {
    val max = a.max()!!
    for (i in 0 until n) {
        if (a[i] == max) {
            if (b.contains(i + 1)) return "Yes"
        }
    }
    return "No"
}