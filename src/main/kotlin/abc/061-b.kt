package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until m).map { Road016b(sc.next().toInt(), sc.next().toInt()) }
    println(problem061b(n, m, a))
}

fun problem061b(n: Int, m: Int, a: List<Road016b>): String {
    val list = (0 until n).map { 0 }.toMutableList()
    for (i in 0 until m) {
        list[a[i].a - 1] += 1
        list[a[i].b - 1] += 1
    }
    return list.joinToString("\n")
}

data class Road016b(var a: Int, var b: Int)