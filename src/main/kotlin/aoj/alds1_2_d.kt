package aoj

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val a = (0 until n).map { sc.next().toLong() }.toMutableList()

    // シェルソート
    var count = 0
    fun insertionSort(a: MutableList<Long>, n: Int, g: Int) {
        (g until n).forEach { i ->
            val v = a[i]
            var j = i - g
            while (j >= 0 && a[j] > v) {
                a[j + g] = a[j]
                j -= g
                count++
            }
            a[j + g] = v
        }
    }

    val g = mutableListOf<Int>()
    var h = 1
    while (h <= n) {
        g.add(h)
        h = 3 * h + 1
    }
    val m = g.size
    repeat((0 until m).count()) { i ->
        insertionSort(a, n, g[i])
    }
    println(m)
    println(g.joinToString(" "))
    println(count)
    a.forEach {
        println(it)
    }
}