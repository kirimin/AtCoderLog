package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val st = (0 until n).map { sc.next() to sc.next() }
    println(problem216b(n, st))
}

fun problem216b(n: Int, st: List<Pair<String, String>>): String {
    val set = mutableSetOf<Pair<String, String>>()
    for (i in 0 until n) {
        val sti = st[i]
        if (set.contains(sti)) return "Yes"
        set.add(sti)
    }
    return "No"
}