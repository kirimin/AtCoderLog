package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val k = sc.nextInt()
    val c = (0 until h).map { sc.next().toCharArray() }
    println(problem173c(h, w, k, c))
}

fun problem173c(h: Int, w: Int, k: Int, c: List<CharArray>): Int {
    var count = 0
    fun isK(list: Array<CharArray>) = list.sumBy { it.count { it == '#' } } == k
    fun allSearch(current: Int, ignoreY: MutableList<Boolean>, ignoreX: MutableList<Boolean>) {
        debugLog(current, ignoreY, ignoreX)
        if (ignoreY.size + ignoreX.size == h + w) {
            val list = Array(h) { CharArray(w) { '.' } }
            for (i in 0 until h) {
                if (ignoreY[i]) continue
                for (j in 0 until w) {
                    if (ignoreX[j]) continue
                    list[i][j] = c[i][j]
                }
            }
            if (isK(list)) count++
            return
        }

        if (current < h) {
            val tmp1 = ignoreY.toMutableList()
            tmp1.add(true)
            allSearch(current + 1, tmp1, ignoreX)
            val tmp2 = ignoreY.toMutableList()
            tmp2.add(false)
            allSearch(current + 1, tmp2, ignoreX)
        } else {
            val tmp1 = ignoreX.toMutableList()
            tmp1.add(true)
            allSearch(current + 1, ignoreY, tmp1)
            val tmp2 = ignoreX.toMutableList()
            tmp2.add(false)
            allSearch(current + 1, ignoreY, tmp2)
        }
    }
    allSearch(0, mutableListOf(), mutableListOf())
    return count
}