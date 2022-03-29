package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    println(problem243b(n, a, b))
}

fun problem243b(n: Int, a: List<Long>, b: List<Long>): String {
    var ans1 = 0
    var ans2 = 0
    val set = a.toSet()
    for (i in 0 until n) {
        val ai = a[i]
        val bi = b[i]
        if (ai == bi) {
            ans1++
        } else if (set.contains(bi)) {
            ans2++
        }
    }
    return ans1.toString() + "\n" + ans2
}