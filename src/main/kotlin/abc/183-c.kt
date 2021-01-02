package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val t = (0 until n).map { (0 until n).map { sc.next().toLong() } }
    println(problem183c(n, k, t))
}

fun problem183c(n: Int, k: Long, t: List<List<Long>>): Long {
    var ans = 0L
    fun search(current: Int, cities: List<Int>, sum: Long) {
        if (cities.isEmpty()) {
            if (sum + t[current][0] == k) {
                ans++
            }
            return
        }
        if (sum > k) {
            return
        }
        for (i in cities.indices) {
            val copy = cities.toMutableList()
            copy.removeAt(i)
            search(cities[i], copy, sum + t[current][cities[i]])
        }
    }
    search(current = 0, cities = (1 until n).toList(), sum = 0L)
    return ans
}