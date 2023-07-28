package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem302c(n, m, s))
}

fun problem302c(n: Int, m: Int, s: List<String>): String {
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

    var ans2 = false
    val intArray = IntArray(n) { it }
    var last = true
    while (last) {
        val ans =  BooleanArray(n - 1)
        for (i in 0 until n - 1) {
            var diff = 0
            for (j in 0 until m) {
                if (s[intArray[i]][j] != s[intArray[i + 1]][j]) {
                    diff++
                }
            }
            if (diff == 1) {
                ans[i] = true
            }
        }
        last = nextPermutation(intArray)
        if ((ans.all { it })) {
            ans2 = true
            break
        }
    }
    return if (ans2) "Yes" else "No"
}