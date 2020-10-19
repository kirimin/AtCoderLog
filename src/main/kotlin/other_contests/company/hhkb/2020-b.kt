package other_contests.company.hhkb

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    println(problem2020b(h, w, s))
}

fun problem2020b(h: Int, w: Int, s: List<String>): Int {
    var count = 0
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (j + 1 < w && s[i][j] == '.' && s[i][j + 1] == '.') count++
            if (i + 1 < h && s[i][j] == '.' && s[i + 1][j] == '.') count++
        }
    }
    return count
}