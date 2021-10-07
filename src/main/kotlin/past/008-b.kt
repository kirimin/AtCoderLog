package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until m).map { sc.next().toLong() }
    println(problem008b(n, m, a, b))
}

fun problem008b(n: Int, m: Int, a: List<Long>, b: List<Long>): String {
    return (a + b).groupBy { it }.filter { it.value.count() == 2 }.map { it.key }.sorted().joinToString(" ")
}