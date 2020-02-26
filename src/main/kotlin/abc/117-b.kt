package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = (0 until n).map { sc.next().toInt() }
    println(problem117b(n, l))
}

fun problem117b(n: Int, l: List<Int>): String {
    val l = l.sorted()
    return if (l.max()!! < l.dropLast(1).sum()) "Yes" else "No"
}