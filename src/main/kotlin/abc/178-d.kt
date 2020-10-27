package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextInt()
    println(problem178d(s))
}

fun problem178d(s: Int): Long {
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
    val dp = LongArray(s + 1) { 0 }
    dp[0] = 1

    for (i in 0 until s) {
        for (j in i + 3..s) {
            dp[j] += dp[i] % mod
        }
    }
    return dp[s] % mod
}

// 2 = 2
// [2],
// [1,1]

// 3 = 4
// [3],
// [2,1], [1,2],
// [1,1,1]

// 4 = 7
// [4],
// [3,1], [1,3], [2,2],
// [2,1,1], [1,2,1], [1,1,2],
// [1,1,1,1]

// 5 = 16
// [5],
// [4,1], [1,4], [2,3], [3,2],
// [3,1,1], [1,3,1], [1,1,3], [2,2,1], [2,1,2], [1,2,2],
// [1,1,1,2], [1,1,2,1], [1,1,1,2], [1,1,2,1]
// [1,1,1,1,1]