package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val k = sc.nextLong()
    println(problem108c(n, k))
}

fun problem108c(n: Long, k: Long): Long {
    var aCount = 0L
    for (i in 1..n) {
        if (i % k == 0L) aCount++
    }
    var bCount = 0L
    for (i in 1..n) {
        if (i % k == k / 2) bCount++
    }
    var ans = aCount * aCount * aCount
    if (k % 2 == 0L) {
        ans += bCount * bCount * bCount
    }
    return ans
}