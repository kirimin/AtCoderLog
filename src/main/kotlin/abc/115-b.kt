package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem115b(n, p))
}

fun problem115b(n: Int, p: List<Int>): Int {
    return p.sorted().mapIndexed { i, pi -> if (i == n - 1) pi / 2 else pi }.sum()
}