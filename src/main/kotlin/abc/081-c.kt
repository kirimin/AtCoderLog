package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem081c(n, k, a))
}

fun problem081c(n: Int, k: Int, a: List<Int>): Int {
    val numbers = hashMapOf<Int, Int>()
    for (i in 0 until n) {
        if (!numbers.contains(a[i])) {
            numbers[a[i]] = 1
        } else {
            numbers[a[i]] = numbers[a[i]]!!.plus(1)
        }
    }
    val counts = numbers.values.sorted()
    var countsSize = counts.size
    if (numbers.size <= k) return 0
    var ans = 0
    for (i in counts.indices) {
        ans += counts[i]
        countsSize -= 1
        if (countsSize <= k) {
            return ans
        }
    }
    return ans
}