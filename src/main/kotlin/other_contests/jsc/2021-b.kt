package other_contests.jsc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val b = (0 until m).map { sc.next().toInt() }
    println(problem2021b(n, m, a, b))
}

fun problem2021b(n: Int, m: Int, a: List<Int>, b: List<Int>): String {
    val a2 = a.toSet()
    val b2 = b.toSet()
    val list = mutableListOf<Int>()
    for (i in 1..Math.max(a.last(), b.last())) {
        if (a2.contains(i) && !b2.contains(i)) {
            list.add(i)
        } else if (!a2.contains(i) && b2.contains(i)) {
            list.add(i)
        }
    }
    return list.joinToString(" ")
}