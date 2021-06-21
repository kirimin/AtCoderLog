package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val b = (0 until n).map { sc.next().toInt() }
    val c = (0 until n).map { sc.next().toInt() }
    println(problem202c(n, a, b, c))
}

fun problem202c(n: Int, a: List<Int>, b: List<Int>, c: List<Int>): Long {
//    var cnt = 0
//    for (i in 0 until n) {
//        val ai = a[i]
//        for (j in 0 until n) {
//            val bcj = b[c[j] - 1]
//            if (ai == bcj){
//                debugLog(i, j, ai)
//                cnt++
//            }
//        }
//    }
//    debugLog(cnt)

    val bc = hashMapOf<Int, Int>()
    for (i in 0 until n) {
        if (bc[b[c[i] - 1]] == null) {
            bc[b[c[i] - 1]] = 1
        } else {
            bc[b[c[i] - 1]] = bc[b[c[i] - 1]]!! + 1
        }
    }
//    debugLog(bc)
    var count = 0L
    for (i in 0 until n) {
        val ai = a[i]
        count += bc[ai] ?: 0
    }

    return count
}

// まずBをCに変換する
// Bのうち、Cに含まれているものが存在しうる
