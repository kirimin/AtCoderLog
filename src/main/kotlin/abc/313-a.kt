package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem313a(n, p))
}

fun problem313a(n: Int, p: List<Int>): Int {
    return if (p.max() != p[0]) p.max()!! - p[0] + 1 else if (p.count { it == p[0] } != 1) p.max()!! - p[0] + 1 else 0
}