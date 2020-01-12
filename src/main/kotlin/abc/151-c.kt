package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ps = (0 until m).map { sc.next().toInt() to sc.next() }
    println(problem151c(n, m, ps))
}

fun problem151c(n: Int, m: Int, ps: List<Pair<Int, String>>): String {
    if (m == 0) return "0 0"
    val ps = ps.sortedBy { it.first }
    var waCount = 0
    var waCount2 = 0
    var acCount = 0
    var currentP = ps[0].first
    var isAc = false
    for (i in 0 until m) {
        val psi = ps[i]
        if (currentP != psi.first) {
            currentP = psi.first
            isAc = false
            waCount = 0
        }
        if (isAc) continue
        if (psi.second == "WA") waCount++
        if (psi.second == "AC") {
            acCount++
            waCount2 += waCount
            waCount = 0
            isAc = true
        }
    }
    return "$acCount $waCount2"
}