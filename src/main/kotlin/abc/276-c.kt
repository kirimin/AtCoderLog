package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem276c(n, p))
}

fun problem276c(n: Int, p: List<Int>): String {
    fun prevPermutation(array: IntArray): Boolean {
        var i = array.size - 1
        while (i > 0 && array[i - 1] <= array[i]) i--
        if (i <= 0) return false
        var j = array.size - 1
        while (array[j] >= array[i - 1]) j--
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

    val intArray = p.toIntArray()
    prevPermutation(intArray)
    return intArray.joinToString(" ")
}