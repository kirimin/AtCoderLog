package typical90

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val q = sc.nextInt()
    val tx = (0 until q).map { sc.next().toInt() to sc.next().toLong() }
    println(problem061(q, tx))
}

fun problem061(q: Int, tx: List<Pair<Int, Long>>): String {
    val ans = mutableListOf<Long>()
    val size = 100000 * 2
    val array = LongArray(size)
    var left = size / 2
    var right = size / 2 + 1
    for (i in 0 until q) {
        val (t, x) = tx[i]
        when (t) {
            1 -> {
                array[left] = x
                left--
            }
            2 -> {
                array[right] = x
                right++
            }
            3 -> {
                ans.add(array[left + x.toInt()])
            }
        }
    }
    return ans.joinToString("\n")
}