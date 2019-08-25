package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem059c(n, a))
}

fun problem059c(n: Int, aArg: List<Long>): Long {
    val count1 = compute(n, aArg)
    val a = aArg.toMutableList()
    val a0 = a[0]
    var count = 0L
    if (a0 > 0) {
        val tmp = a0 + 1
        a[0] = a0 - tmp
        count += tmp
    } else {
        val tmp = a0 - 1
        a[0] = a0 - tmp
        count -= tmp
    }
    val count2 = compute(n, a) + count
    return Math.min(count1, count2)
}

fun compute(n: Int, aArg: List<Long>): Long {
    val a = aArg.toMutableList()
    var count = 0L
    var sum = 0L
    for (i in 0 until n) {
        if (sum + a[i] == 0L) {
            count++
            if (a[i] < 0) {
                a[i] = a[i] + 1
            } else {
                a[i] = a[i] - 1
            }
        }
        sum += a[i]
        if (i >= n - 1) {
            continue
        }
        val ai2 = a[i + 1]
        val sum2 = sum + ai2
        if (sum * sum2 < 0) {
            continue
        }
        if (sum > 0) {
            val tmp = sum + 1
            a[i + 1] = tmp * -1
            count += tmp + ai2
        } else {
            val tmp = Math.abs(sum - 1)
            a[i + 1] = tmp
            count += tmp - ai2
        }
    }
    return count
}