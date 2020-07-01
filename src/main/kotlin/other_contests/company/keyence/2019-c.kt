package other_contests.company.keyence

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    println(problem2019c(n, a, b))
}

fun problem2019c(n: Int, a: List<Long>, b: List<Long>): Int {
    val diff = LongArray(n)
    var plusList = mutableListOf<Long>()
    val minusList = mutableListOf<Long>()
    for (i in 0 until n) {
        val diffI = a[i] - b[i]
        diff[i] = diffI
        if (diffI > 0) {
            plusList.add(diffI)
        } else if (diffI < 0) {
            minusList.add(diffI)
        }
    }
    if (minusList.isEmpty()) return 0
    if (plusList.sum() < Math.abs(minusList.sum())) return -1
    plusList = plusList.sortedDescending().toMutableList()
    val minusSum = Math.abs(minusList.sum())
    var count = 0
    var p = 0L
    for (i in 0 until plusList.size) {
        p += plusList[i]
        count++
        if (p >= minusSum) break
    }
    return minusList.count() + count
}