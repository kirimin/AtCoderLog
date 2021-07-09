package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val st = (0 until n).map { sc.next() to sc.next().toInt() }
    println(problem201b(n, st))
}

fun problem201b(n: Int, st: List<Pair<String, Int>>): String {
    return st.sortedByDescending { it.second }[1].first
}