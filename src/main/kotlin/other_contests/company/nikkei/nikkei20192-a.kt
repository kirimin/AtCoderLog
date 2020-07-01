package other_contests.company.nikkei

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problemnikkei20192a(n))
}

fun problemnikkei20192a(n: Int): Int {
    return n - (n / 2) - 1
}

// 2
// 0

// 3
// 1 + 2
// 1

// 4
// 1 + 3
// 1

// 5
// 1 + 4, 2 + 3
// 2

// 6
// 1 + 4, 2 + 4
// 2

// 7
// 1 + 6, 2 + 5, 3 + 4
// 3

// 8
// 1 + 7, 2 + 6, 3 + 5
// 3