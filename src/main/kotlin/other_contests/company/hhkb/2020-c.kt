package other_contests.company.hhkb

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem2020c(n, p))
}

fun problem2020c(n: Int, p: List<Int>): String {
    var min = 0
    var max = 0
    val hash = hashSetOf<Int>()
    val ans = mutableListOf<Int>()
    for (i in 0 until n) {
        val pi = p[i]
        hash.add(pi)
        var isFound = false
        for (j in min..n) {
            if (!hash.contains(j)) {
                ans.add(j)
                isFound = true
            }
            if (isFound && !hash.contains(j)) {
                min = j
                break
            }
        }
    }
    return ans.joinToString("\n")
}