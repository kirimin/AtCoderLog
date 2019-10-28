package abc

import utilities.debugLog
import java.util.*
import java.util.Comparator



fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = (0 until n).map { sc.next().toInt() }
    println(problem143d(n, l))
}

fun problem143d(n: Int, l: List<Int>): Long {
    class LowerBoundComparator<T : Comparable<T>> : Comparator<T> {
        override fun compare(x: T, y: T): Int {
            return if (x >= y) 1 else -1
        }
    }
    val l = l.sorted()
    var count = 0L
    for (i in 0 until n) {
        val a = l[i]
        for (j in i + 1 until n) {
            val b = l[j]
            val k = Math.abs(Collections.binarySearch(l, a + b, LowerBoundComparator())) - 1
            count += Math.max(k - (j + 1), 0)
        }
    }
    return count
}