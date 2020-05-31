package arc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val mt = (0 until n).map { sc.next().toDouble() to sc.next().toDouble() }
    println(problem015b(n, mt))
}

fun problem015b(n: Int, mt: List<Pair<Double, Double>>): String {
    val ans = IntArray(6) { 0 }
    for (i in 0 until n) {
        val mti = mt[i]
        if (mti.first >= 35.0) {
            ans[0]++
        }
        if (mti.first >= 30.0 && mti.first < 35.0) {
            ans[1]++
        }
        if (mti.first >= 25.0 && mti.first < 30.0) {
            ans[2]++
        }
        if (mti.second >= 25.0) {
            ans[3]++
        }
        if (mti.second < 0.0 && mti.first >= 0.0) {
            ans[4]++
        }
        if (mti.first < 0.0) {
            ans[5]++
        }
    }
    return ans.joinToString(" ")
}