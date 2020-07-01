package other_contests.company.keyence

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val n = sc.nextInt()
    println(problem2020a(h, w, n))
}

fun problem2020a(h: Int, w: Int, n: Int): Int {
    var sum = 0
    var count = 0
    while (sum < n) {
        sum += Math.max(h, w)
        count++
    }
    return count
}