package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val q = sc.nextInt()
    val tab = (0 until q).map { Triple(sc.next().toInt(), sc.next().toLong(), sc.next().toLong()) }
    println(problem278c(n, q, tab))
}

fun problem278c(n: Long, q: Int, tab: List<Triple<Int, Long, Long>>): String {
    val follows = mutableMapOf<Long, MutableSet<Long>>()
    for (i in 0 until q) {
        val (t, a, b) = tab[i]
        if (t == 1) {
            if (follows[a] == null) {
                follows[a] = mutableSetOf()
            }
            follows[a]!!.add(b)
        } else if (t == 2) {
            if (follows[a] == null) {
                follows[a] = mutableSetOf()
            }
            follows[a]!!.remove(b)
        } else {
            if (follows[a] != null && follows[a]!!.contains(b) && follows[b] != null && follows[b]!!.contains(a)) {
                println("Yes")
            } else {
                println("No")
            }
        }
    }
    return ""
}