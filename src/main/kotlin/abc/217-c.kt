package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem217c(n, p))
}

fun problem217c(n: Int, p: List<Int>): String {
    val ans = IntArray(n)
    for (i in 0 until n) {
        ans[p[i] - 1] = i + 1
    }
    return ans.joinToString(" ")
}