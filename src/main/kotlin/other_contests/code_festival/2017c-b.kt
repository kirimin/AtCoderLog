package other_contests.code_festival

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem2017b(n, a))
}

fun problem2017b(n: Int, a: List<Int>): Int {
    val results = mutableListOf<Int>()
    fun computePattern(i: Int, multi: Int) {
        if (i == n) {
            results.add(multi)
            return
        }
        computePattern(i + 1, multi * a[i])
        computePattern(i + 1, multi * (a[i] + 1))
        computePattern(i + 1, multi * (a[i] - 1))
    }
    computePattern(0, 1)
    return results.filter { it % 2 == 0 }.count()
}