package other_contests.pakencamp_2019_day3

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { (0 until m).map { sc.next().toLong() } }
    println(problemc(n, m, a))
}

fun problemc(n: Int, m: Int, a: List<List<Long>>): Long {
    var max = 0L
    for (t1 in 0 until m) {
        for (t2 in t1 + 1 until m) {
            var sum = 0L
            for (i in 0 until n) {
                sum += Math.max(a[i][t1], a[i][t2])
            }
            max = Math.max(max, sum)
        }
    }
    return max
}