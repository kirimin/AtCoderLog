package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = (0 until 9).map { sc.next() }
    println(problem275c(s))
}

fun problem275c(s: List<String>): Int {
    var ans = 0
    for (i in 0 until 2) {
        for (j in 0 until 2) {
            val m = s[i][j]
            if (m != '#') continue

//            var j1 = j + 1
//            var count = 0
//            var flag = false
//            while (j1 < 9) {
//                count++
//                if (s[i][j1] == '#') {
//                    flag = true
//                    break
//                }
//                j1++
//            }
//            if (!flag) continue
//
//            if (s[i + count][j] == '#' && s[i + count][j + count] == '#') {
//                ans++
//            }

            var iDiff = 0
            var jDiff = 0
            for (i2 in 0.. i) {
                for (j2 in j until 9) {
                    if (i2 == i && j2 == j) continue
                    if (s[i2][j2] == '#') {
                        iDiff = i2 - i
                        jDiff = j2 - j
                        debugLog(i, j, iDiff, jDiff)

                        if (s[i][j + jDiff + jDiff] == '#' && s[i + -iDiff][j + jDiff] == '#') {
                            debugLog(i, j)
                            ans++
                        }
                    }
                }
            }
        }
    }
    return ans
}