package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    val q = (0 until n).map { sc.next().toInt() }
    println(problem150c(n, p, q))
}

fun problem150c(n: Int, p: List<Int>, q: List<Int>): Int {
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
    val p = p.toIntArray()
    val q = q.toIntArray()
    val nArray = (1..n).toList().toIntArray()
    var last = true
    var a = 0
    var b = 0
    var count = 1
    while (last) {
        if (nArray.joinToString("") == p.joinToString("")) a = count
        if (nArray.joinToString("") == q.joinToString("")) b = count
        last = nextPermutation(nArray)
        count++
    }
    return Math.abs(a - b)
}