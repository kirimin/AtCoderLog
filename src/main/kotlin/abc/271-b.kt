package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val l = (0 until n).map {
        val lx = sc.next().toInt()
        (0 until lx).map {
            sc.next().toLong()
        }
    }
    val st = (0 until q).map {
        sc.next().toInt() to sc.next().toInt()
    }
    println(problem271b(n, q, l, st))
}

fun problem271b(n: Int, q: Int, l: List<List<Long>>, st: List<Pair<Int, Int>>): String {
    for (i in 0 until q) {
        val (s, t) = st[i]
        println(l[s - 1][t - 1])
    }
    return ""
}