package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    println(problem305c(h, w, s))
}

fun problem305c(h: Int, w: Int, s: List<String>): String {
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (s[i][j] == '.') {
                var count = 0
                if (i - 1 >= 0 && s[i - 1][j] == '#') count++
                if (i + 1 < h && s[i + 1][j] == '#') count++
                if (j - 1 >= 0 && s[i][j - 1] == '#') count++
                if (j + 1 < w && s[i][j + 1] == '#') count++
                if (count >= 2) {
                    return "${i+1} ${j + 1}"
                }
            }
        }
    }
    return ""
}