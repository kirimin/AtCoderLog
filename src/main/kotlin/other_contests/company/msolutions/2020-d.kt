package other_contests.company.msolutions

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem2020d(n, a))
}

fun problem2020d(n: Int, a: List<Int>): Long {
    var genkin = 1000L
    var kabu = 0L
    for (i in 0 until n - 1) {
//        debugLog(genkin, kabu)
        if (a[i] < a[i + 1]) {
            kabu += genkin / a[i]
            genkin %= a[i]
//            debugLog("i:$i buy")
            continue
        }
        if (a[i] > a[i + 1]) {
            genkin += kabu * a[i]
            kabu = 0
//            debugLog("i:$i sell")
            continue
        }
    }
//    debugLog(genkin, kabu)
    genkin +=  kabu * a.last()
    return genkin
}