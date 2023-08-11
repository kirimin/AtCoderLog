package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem276b(n, m, ab))
}

fun problem276b(n: Int, m: Int, ab: List<Pair<Int, Int>>): String {
    val routes = Array(n) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        routes[a - 1].add(b)
        routes[b - 1].add(a)
    }

    for (i in 0 until routes.size) {
        println(routes[i].size.toString() + " " + routes[i].sorted().joinToString(" "))
    }
    return ""
}