package typical90

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { (0 until w).map { sc.next().toInt() } }
    println(problem004(h, w, a))
}

fun problem004(h: Int, w: Int, a: List<List<Int>>): String {
    val wSum = IntArray(w)
    val hSum = IntArray(h)
    for (i in 0 until h) {
        for (j in 0 until w) {
            hSum[i] += a[i][j]
        }
    }
    for (j in 0 until h) {
        for (i in 0 until w) {
            wSum[i] += a[j][i]
        }
    }

    val ans = StringBuilder()
    for (i in 0 until h) {
        for (j in 0 until w) {
            ans.append(wSum[j] + hSum[i] - a[i][j])
            ans.append(" ")
        }
        ans.append("\n")
    }
    return ans.toString()
}