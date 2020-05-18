package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem159d(n, a))
}

fun problem159d(n: Int, a: List<Long>): String {
    /**
     * N個の中から2個を選ぶ公式
     */
    fun take2ByN(n: Long): Long {
        return n * (n - 1) / 2
    }
    val countMap = a.groupBy { it }
    val all = countMap.map { take2ByN(it.value.count().toLong()) }.sum()
    val ans = LongArray(n)
    for (i in 0 until n) {
        val num = countMap[a[i]]!!.count().toLong()
        val before = take2ByN(num)
        val after = (num - 1) * (num - 2) / 2
        ans[i] = all - before + after
    }

    return ans.joinToString("\n")
}