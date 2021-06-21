package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem006d(n, k, a))
}

fun problem006d(n: Int, k: Int, a: List<Long>): String {
    val ans = mutableListOf<Long>()
    var current = a.subList(0, k - 1).sum()
    for (i in 0 until n - k + 1) {
        if (i != 0) {
            current -= a[i - 1]
        }
        current += a[i + k - 1]
        ans.add(current)
    }
    return ans.joinToString("\n")
}