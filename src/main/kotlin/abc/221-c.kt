package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem221c(n))
}

fun problem221c(n: Long): Long {
    /**
     * 辞書順で順列の次の組み合わせにarrayを書き換える
     */
    fun nextPermutation(array: CharArray): Boolean {
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

    val list = n.toString().toList().sorted().toCharArray()
    var last = true
    var max = 0L
    while (last) {
        last = nextPermutation(list)
        var m = 0L
        for (i in 1 until list.size) {
            val a = list.take(i).joinToString("").toLong()
            val b = list.takeLast(list.size - i).joinToString("").toLong()
            m = Math.max(m, a * b)
        }
        max = Math.max(m, max)
    }
    return max
}