package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem171b(n, k, p))
}

fun problem171b(n: Int, k: Int, p: List<Int>): Int {
    return p.sorted().take(k).sum()
}