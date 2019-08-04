package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val m = sc.nextLong()
    println(problem55c(n, m))
}

fun problem55c(s: Long, c: Long): Long {
    var sTmp = s
    var cTmp = c
    var count = Math.min(cTmp / 2, sTmp)
    sTmp -= count
    cTmp -= count * 2
    if (sTmp == 0L && cTmp >= 2) {
        cTmp -= 2
        sTmp++
    }
    while ((sTmp >= 1 && cTmp >= 2) || cTmp >= 3) {
        count++
        sTmp--
        cTmp -= 2
        if (sTmp == 0L && cTmp >= 2) {
            if (cTmp > 100000) {
                count += 20000
                cTmp -= 80000
            }
            cTmp -= 2
            sTmp++
        }
    }
    return count
}