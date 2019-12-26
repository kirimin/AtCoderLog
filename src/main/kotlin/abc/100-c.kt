package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem100c(n, a))
}

fun problem100c(n: Int, a: List<Int>): Int {
    /**
     * 何回割り切れるか
     */
    fun log(num: Long, base: Long): Long {
        var count = 0L
        var tmp = num
        while (tmp % 2 == 0L) {
            tmp /= 2
            count++
        }
        return count
    }
    val array = IntArray(n) { -1 }
    for (i in 0 until n) {
        array[i] = log(a[i].toLong(), 2L).toInt()
    }
    return array.sum()
}