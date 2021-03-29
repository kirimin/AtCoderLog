package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem196c(n))
}

fun problem196c(n: Long): Int {
//    var count = hashMapOf<Int, Int>()
//    for (i in 1..n) {
//        val iStr = i.toString()
//        if (iStr.length % 2 != 0) continue
//        if (iStr.take(iStr.length / 2) == iStr.takeLast(iStr.length / 2)) {
//            count[iStr.length] = (count[iStr.length] ?: 0) + 1
//            debugLog(i)
//        }
//    }
//    debugLog(count, count.toList().sumBy { it.second })

    if (n < 10) return 0
    val nStr = n.toString()
    val len = nStr.length
    var ans = 0
    val div = if (len % 2 != 0) 1 else 0
    val left = nStr.take(len / 2 + div).toLong()
    for (i in 1..left) {
        if (n >= (i.toString() + i.toString()).toLong()) {
            ans++
        }
    }
    return ans
}