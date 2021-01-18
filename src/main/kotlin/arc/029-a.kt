package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = (0 until n).map { sc.next().toInt() }
    println(problem029a(n, t))
}

fun problem029a(n: Int, t: List<Int>): Int {
    /**
     * 辞書順で順列の次の組み合わせにarrayを書き換える
     */
    fun nextPermutation(array: IntArray): Boolean {
        var i = array.size - 1
        while (i > 0 && array[i - 1] >= array[i]) i--
        if (i <= 0) return false
        var j = array.size - 1
        while (array[j] <= array[i - 1]) j--
        var temp = array[i - 1]
        array[i - 1] = array[j]
        array[j] = temp
        j = array.size - 1
        while (i < j) {
            temp = array[i]
            array[i] = array[j]
            array[j] = temp
            i++
            j--
        }
        return true
    }
    if (n == 1) return t[0]

    var min = Integer.MAX_VALUE
    for (i in 1..n) {
        for (j in 1..n) {
            if (i + j != n) continue
            var last = true
            val t = t.sorted().toIntArray()
            while (last) {
                min = Math.min(min, Math.max(t.takeLast(j).sum(), t.take(i).sum()))
                last = nextPermutation(t)
            }
        }
    }
    return min
}

// [100 10] [20 30]