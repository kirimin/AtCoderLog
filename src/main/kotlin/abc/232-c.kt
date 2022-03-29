package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    val cd = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem232c(n, m, ab, cd))
}

fun problem232c(n: Int, m: Int, ab: List<Pair<Int, Int>>, cd: List<Pair<Int, Int>>): String {
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
    val abG = Array(n) { mutableListOf<Int>() }
    val cdG = Array(n) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val (a, b) = ab[i]
        abG[a - 1].add(b - 1)
        abG[b - 1].add(a - 1)
        val (c, d) = cd[i]
        cdG[c - 1].add(d - 1)
        cdG[d - 1].add(c - 1)
    }
    val abCount = IntArray(n)
    for (i in 0 until n) {
        abCount[i] = abG[i].size
    }
    val intArray = (0 until n).toList().toIntArray()
    var last = true
    while (last) {
        var isOk = true
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (abG[i][j] != cdG[intArray[i]][intArray[j]]) isOk = false
            }
            if (isOk) return "Yes"
        }
        last = nextPermutation(intArray)
    }
    return "No"
}