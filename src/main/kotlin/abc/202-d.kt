package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val k = sc.nextLong()
    println(problem202d(a, b, k))
}

fun problem202d(a: Int, b: Int, k: Long): String {
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

    var s = CharArray(a) { 'a' } + CharArray(b) { 'b' }

    var last = true
    var count = 1L
    while (last) {
        debugLog(s.joinToString(""), count)
        if (count == k) return s.joinToString("")
        last = nextPermutation(s)
        count++
    }

    return ""
}