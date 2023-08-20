package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map {
        val c = sc.next().toInt()
        (0 until c).map { sc.next().toInt() }
    }
    val x = sc.nextInt()
    println(problem314b(n, a, x))
}

fun problem314b(n: Int, a: List<List<Int>>, x: Int): String {
    val ans = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until n) {
        if (a[i].contains(x)) {
            ans.add(i + 1 to a[i].size)
        }
    }
    val min = ans.minByOrNull { it.second }?.second
    return if (min == null) {
        "0\n"
    } else {
        ans.filter { it.second == min }.size.toString() + "\n" + ans.filter { it.second == min }.map { it.first }
            .joinToString(" ")
    }
}