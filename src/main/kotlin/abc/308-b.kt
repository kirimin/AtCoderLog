package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val c = (0 until n).map { sc.next() }
    val d = (0 until m).map { sc.next() }
    val p = (0 until m + 1).map { sc.next().toInt() }
    println(problem308b(n, m, c, d, p))
}

fun problem308b(n: Int, m: Int, c: List<String>, d: List<String>, p: List<Int>): Int {
    var sum = 0
    for (i in 0 until n) {
        if (!d.contains(c[i])) {
            sum += p[0]
            continue
        }
        sum += p[d.indexOf(c[i]) + 1]
    }
    return sum
}