package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    val test = (0 until t).map {
        val n = sc.nextInt()
        (0 until n).map { sc.next().toLong() }
    }
    println(problem284b(t, test))
}

fun problem284b(t: Int, test: List<List<Long>>): String {
    val ans = mutableListOf<Int>()
    for (i in 0 until t) {
        ans.add(test[i].count { it % 2 != 0L })
    }
    return ans.joinToString("\n")
}