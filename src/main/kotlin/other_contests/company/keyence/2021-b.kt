package other_contests.company.keyence

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem2021b(n, k, a))
}

fun problem2021b(n: Int, k: Int, a: List<Long>): Long {
    val list = mutableListOf<Pair<Long, Long>>()
    val a = a.sorted().groupBy { it }
    if (!a.containsKey(0)) return 0
    var currentSize = a[0]!!.size.toLong()
    var iTmp = 0L
    for (i in 1L until n) {
        val diff = currentSize - Math.min(currentSize, a[i]?.size?.toLong() ?: 0L)
        list.add(i to diff)
        currentSize = Math.min(currentSize, a[i]?.size?.toLong() ?: 0L)
        if (currentSize == 0L) break
        iTmp = i
    }
    if (iTmp == n - 1L) {
        val diff = currentSize
        list.add(n * diff to diff)
    }
    list.sortByDescending { it.first }
    var k = k
    var sum = 0L
    var i = 0
    var count = 0L
    while (k != 0) {
        if (list[i].second <= count) {
            i++
            if (i >= list.size) {
                break
            }
            count = 0
            continue
        }
        sum += list[i].first
        k--
        if (k == 0) break
        count++
    }
    return sum
}