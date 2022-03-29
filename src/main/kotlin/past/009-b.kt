package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem009b(n, ab))
}

fun problem009b(n: Int, ab: List<Pair<Int, Int>>): Int {
    var count = 0
    val coins = intArrayOf(1, 5, 10, 50, 100, 500).reversed()
    for (i in 0 until n) {
        val (a, b) = ab[i]
        var mod = b - a
        for (coin in coins) {
            if (coin == 50 || coin == 5) {
                count += mod / coin
            }
            mod %= coin
        }
    }
    return count
}
