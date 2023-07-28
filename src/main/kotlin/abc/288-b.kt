package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem288b(n, k, s))
}

fun problem288b(n: Int, k: Int, s: List<String>): String {
    return s.take(k).sorted().joinToString("\n")
}