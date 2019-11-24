package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    println(problem096c(h, w, s))
}

fun problem096c(h: Int, w: Int, s: List<String>): String {
    for (i in 0 until h) {
        val si = s[i]
        for (j in si.indices) {
            if (si[j] != '#') continue
            if ((j != w - 1 && si[j + 1] != '#') &&
                (j != 0 && si[j - 1] != '#') &&
                (i != h - 1 && s[i + 1][j] != '#') &&
                (i != 0 && s[i - 1][j] != '#')
            ) {
                return "No"
            }
        }
    }
    return "Yes"
}