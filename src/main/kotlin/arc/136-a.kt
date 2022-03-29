package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem136a(n, s))
}

fun problem136a(n: Int, s: String): String {
    val ans = mutableListOf<Char>()
    var aCount = 0
    var bCount = 0
    for (i in 0 until n) {
        val si = s[i]
        when (si) {
            'A' -> aCount++
            'B' -> bCount++
            'C' -> {
                ans += (0 until aCount + (bCount / 2)).map { 'A' }
                if (bCount % 2 != 0) ans += 'B'
                ans += 'C'
                aCount = 0
                bCount = 0
            }
        }
    }
    ans += (0 until aCount + bCount / 2).map { 'A' }
    if (bCount % 2 != 0) ans += 'B'
    return ans.joinToString("")
}