package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { (0 until n).map { sc.next().toInt() } }
    val m = sc.nextInt()
    val xy = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem032(n, a, m, xy))
}

fun problem032(n: Int, a: List<List<Int>>, m: Int, xy: List<Pair<Int, Int>>): Int {
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

    val array = (0 until n).toList().toIntArray()
    var isNotLast = true
    var min = Integer.MAX_VALUE
    while (isNotLast) {
        var isWrong = false
        for (i in 0 until m) {
            val (x, y) = xy[i]
            for (j in 0 until n - 1) {
                if ((array[j] == x - 1 && array[j + 1] == y - 1) ||
                    (array[j] == y - 1 && array[j + 1] == x - 1)
                ) {
                    isWrong = true
                    break
                }
            }
            if (isWrong) break
        }
        if (isWrong) {
            isNotLast = nextPermutation(array)
            continue
        }
        var sum = 0
        for (i in 0 until n) {
            sum += a[array[i]][i]
        }
        min = Math.min(min, sum)
        isNotLast = nextPermutation(array)
    }

    return if (min == Integer.MAX_VALUE) -1 else min
}