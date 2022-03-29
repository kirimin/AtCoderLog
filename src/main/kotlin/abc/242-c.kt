package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem242c(n))
}

fun problem242c(n: Int): Int {
    val mod = 998244353L
    var list = mutableListOf<String>()
    fun search(i: Int, prev: Int, num: String) {
        if (i >= n - 1) {
            if (num.last() != num.dropLast(1).last()) list.add(num)
            return
        }
        if (prev != 1) {
            search(i + 1, prev - 1, num + (prev - 1))
        }
        search(i + 1, prev, num + prev)
        if (prev != 9) {
            search(i + 1, prev + 1, num + (prev + 1))
        }
    }
    for (i in 1..9) {
        search(0, i, i.toString())
    }
    debugLog(list)
    return list.count()

}