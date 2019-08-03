package aoj

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val a = (0 until n).map { sc.next() }.toMutableList()

    fun insertSort(a: MutableList<String>): List<String> {
        a.forEachIndexed { i, _ ->
            var j = i - 1
            val v = a[i]
            while (j >= 0 && a[j].drop(1).toInt() > v.drop(1).toInt()) {
                a[j + 1] = a[j]
                j--
            }
            a[j + 1] = v
            println(a)
        }
        return a
    }

    fun bubbleSort(a: MutableList<String>): List<String> {
        var count = 0
        (0 until n).forEach { i ->
            var minj = i
            (i until n).forEach { j ->
                if (a[j].drop(1).toInt() < a[minj].drop(1).toInt()) {
                    minj = j
                }
            }
            val tmp = a[i]
            a[i] = a[minj]
            a[minj] = tmp
            count++
        }
        return a
    }

    val bubbleSorted = bubbleSort(a.toMutableList())
    val insertSorted = insertSort(a.toMutableList())
    println(bubbleSorted.joinToString(" "))
    println("Stable")
    println(insertSorted.joinToString(" "))
    println(if (bubbleSorted == insertSorted) "Stable" else "Not stable")
}