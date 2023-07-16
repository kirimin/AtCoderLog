package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextInt()
    val c = sc.nextInt()
    val b = (0 until r).map { sc.next() }
    println(problem295b(r, c, b))
}

fun problem295b(r: Int, c: Int, b: List<String>): String {
    val ans = Array(r) { CharArray(c) { ' ' } }
    for (i in 0 until r) {
        for (j in 0 until c) {
            ans[i][j] = b[i][j]
        }
    }
    for (i in 0 until r) {
        for (j in 0 until c) {
            if (b[i][j] in '1'..'9') {
                val num = b[i][j].toString().toInt()
                for (i2 in 0 until r) {
                    for (j2 in 0 until c) {
                        // i,jとi2,j2の距離
                        val distance = Math.abs(i - i2) + Math.abs(j - j2)
                        if (distance <= num) {
                            ans[i2][j2] = '.'
                        }
                    }
                }
            }
        }
    }

    return ans.map { it.joinToString("") }.joinToString("\n")
}