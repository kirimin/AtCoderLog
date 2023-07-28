package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h1 = sc.nextInt()
    val h2 = sc.nextInt()
    val h3 = sc.nextInt()
    val w1 = sc.nextInt()
    val w2 = sc.nextInt()
    val w3 = sc.nextInt()
    println(problem256c(h1, h2, h3, w1, w2, w3))
}

fun problem256c(h1: Int, h2: Int, h3: Int, w1: Int, w2: Int, w3: Int): Int {
    var count = 0
    fun check(list: MutableList<Int>): Boolean {
        return list[0] + list[1] + list[2] == h1 &&
            list[3] + list[4] + list[5] == h2 &&
            list[6] + list[7] + list[8] == h3 &&
            list[0] + list[3] + list[6] == w1 &&
            list[1] + list[4] + list[7] == w2 &&
            list[2] + list[5] + list[8] == w3
    }

    fun search(list: MutableList<Int>) {
        if (list.size == 1) {
            if (list[0] > h1) return
            if (list[0] > w1) return
        }
        if (list.size == 2) {
            if (list[0] + list[1] > h1) return
            if (list[1] > w2) return
        }
        if (list.size == 3) {
            if (list[0] + list[1] + list[2] != h1) return
            if (list[2] > w3) return
        }
        if (list.size == 4) {
            if (list[3] > h2) return
            if (list[0] + list[3] > w1) return
        }
        if (list.size == 5) {
            if (list[3] + list[4] > h2) return
            if (list[1] + list[4] > w2) return
        }
        if (list.size == 6) {
            if (list[3] + list[4] + list[5] != h2) return
            if (list[2] + list[5] > w3) return
        }
        if (list.size == 7) {
            if (list[6] > h3) return
            if (list[0] + list[3] + list[6] != w1) return
        }
        if (list.size == 8) {
            if (list[6] + list[7] > h3) return
            if (list[1] + list[4] + list[7] != w2) return
        }
        if (list.size == 9) {
            if (check(list)) {
                count++
            }
            return
        }
        for (i in 1..28) {
            val newList = list.toMutableList()
            newList.add(i)
            search(newList)
        }
    }
    search(mutableListOf())
    return count
}