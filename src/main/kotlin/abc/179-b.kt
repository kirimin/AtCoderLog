package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = (0 until n).map { sc.next().toInt() to sc.next().toInt()  }
    println(problem179b(n, d))
}

fun problem179b(n: Int, d: List<Pair<Int, Int>>): String {
    var zoromeCount = 0
    for (i in 0 until n) {
        val (di1, di2) = d[i]
        if (di1 == di2) zoromeCount++ else zoromeCount = 0
        if (zoromeCount == 3) return "Yes"
    }
    return "No"
}