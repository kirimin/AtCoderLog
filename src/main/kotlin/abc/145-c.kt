package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toDouble() to sc.next().toDouble() }
    println(problem145c(n, xy))
}

fun problem145c(n: Int, xy: List<Pair<Double, Double>>): Double {
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
        // Reverse the suffix
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

    val intArray = (0 until n).toList().toIntArray()
    val sum = mutableListOf<Double>()
    var last = true
    while (last) {
        val list = DoubleArray(n) { 0.0 }
        for (i in 1 until n) {
            list[intArray[i - 1]] = Math.sqrt(
                (Math.pow(Math.abs(xy[intArray[i - 1]].first - xy[intArray[i]].first), 2.0)) +
                (Math.pow(Math.abs(xy[intArray[i - 1]].second - xy[intArray[i]].second), 2.0))
            )
        }
        sum.add(list.sum())
        last = nextPermutation(intArray)
    }
    return sum.average()
}