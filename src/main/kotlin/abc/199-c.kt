package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    val q = sc.nextInt()
    val tab = (0 until q).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem199c(n, s, q, tab))
}

fun problem199c(n: Int, s: String, q: Int, tab: List<Triple<Int, Int, Int>>): String {
    val list = s.toList()
    for (i in 0 until q) {
        val (t, a, b) = tab[i]
        when (t) {
            1 -> {
                Collections.swap(list, a - 1, b - 1)
            }
            2 -> {
            }
        }
    }
    return list.joinToString("")
}