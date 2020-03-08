package abc

import java.util.*

data class Query(val q: Int, val f: Int = 0, val c: String = "")

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val q = sc.nextInt()
    val queries = (0 until q).map {
        val q = sc.next().toInt()
        if (q == 1) Query(q) else Query(q, sc.nextInt(), sc.next())
    }
    println(problem158d(s, q, queries))
}

fun problem158d(s: String, q: Int, queries: List<Query>): String {
    val list = LinkedList<String>()
    list.add(s)
    var reverse = false
    for (i in 0 until q) {
        val qi = queries[i]
        if (qi.q == 1) {
            reverse = !reverse
        } else {
            if (qi.f == 1) {
                if (reverse) {
                    list.add(qi.c)
                } else {
                    list.add(0, qi.c)
                }
            } else {
                if (reverse) {
                    list.add(0, qi.c)
                } else {
                    list.add(qi.c)
                }
            }
        }
    }
    var sb: String = list.joinToString("")
    if (reverse) {
        sb = sb.reversed()
    }
    return sb
}