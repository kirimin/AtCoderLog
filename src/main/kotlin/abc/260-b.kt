package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    val z = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val b = (0 until n).map { sc.next().toInt() }
    println(problem260b(n, x, y, z, a, b))
}

fun problem260b(n: Int, x: Int, y: Int, z: Int, a: List<Int>, b: List<Int>): String {
    val ans = (0 until n).toList()
    val list = Array(n) { 0 to (0 to 0) }
    for (i in 0 until n) {
        list[i] = i to (a[i] to b[i])
    }
    val sugaku = list.sortedByDescending { it.second.first }.take(x)
    val nokori1 = list.sortedByDescending { it.second.first }.drop(x).sortedBy { it.first }
    val eigo = nokori1.sortedByDescending { it.second.second }.take(y)
    val nokori2 = nokori1.sortedByDescending { it.second.second }.drop(y).sortedBy { it.first }
    val sum = nokori2.map { it.first to it.second.first + it.second.second }.sortedByDescending { it.second }.take(z)
    return (sugaku.map { it.first + 1 } + eigo.map { it.first + 1 } + sum.map { it.first + 1 }).sorted().joinToString("\n")
}