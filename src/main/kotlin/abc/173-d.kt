package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem173d(n, a))
}

fun problem173d(n: Int, a: List<Long>): Long {
    val a = a.sortedDescending()
    var ans = 0L

    ans += a[0]
    var current = 1
    var count = 0
    for (i in 1 until n - 1) {
        if (count == 2) {
            count = 0
            current++
        }
        ans += a[current]
        count++
    }
    return ans
}

// 10 2 6 3 8 5 1 9 3 7 4
// 0,10,9,9,8,8,7,7,6,6,5

// 10 6 9 7 4 9 5 8 6
// 0,10,9,9,9,9,8,8,7