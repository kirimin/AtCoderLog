package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem082c(n, a))
}

fun problem082c(n: Int, a: List<Long>):Int {
    val countsMap = hashMapOf<Long, Int>()
    var count = 0
    for (i in 0 until n) {
        val ai = a[i]
        if (countsMap.contains(ai)) {
            countsMap[ai] = countsMap[ai]!! + 1
            val iCount = countsMap[ai]!!
            if (iCount > ai) {
                count++
            }
        } else {
            countsMap[a[i]] = 1
        }
    }
    countsMap.forEach { entry ->
        if (entry.key > entry.value) {
            count += entry.value
        }
    }
    return count
}