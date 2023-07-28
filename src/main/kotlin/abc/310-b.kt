package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val pcf = (0 until n).map {
        val p = sc.nextInt()
        val c = sc.nextInt()
        Triple(p, c, (0 until c).map { sc.next().toInt() })
    }
    println(problem310b(n, m, pcf))
}

fun problem310b(n: Int, m: Int, pcf: List<Triple<Int, Int, List<Int>>>): Any {
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) continue
            val (pi, ci, fi) = pcf[i]
            val (pj, cj, fj) = pcf[j]
            if (pi >= pj && fj.containsAll(fi)) {
                if (pi > pj || fj.size > fi.size) return "Yes"
            }
        }
    }
    return "No"
}