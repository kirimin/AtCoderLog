package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    println(problem161d(k))
}

fun problem161d(k: Int): Long {
    val all = mutableListOf<Long>()
    fun search(current: Long) {
        all.add(current)
        if (current.toString().length >= 10) return
        val lastNum = current.toString().last().toString().toInt()
        if (lastNum != 0) {
            search((current.toString() + (lastNum - 1)).toLong())
        }
        search((current.toString() + (lastNum)).toLong())
        if (lastNum != 9) {
            search((current.toString() + (lastNum + 1)).toLong())
        }
    }

    for (i in 1..9L) {
        search(i)
    }
    return all.sorted()[k - 1]
}