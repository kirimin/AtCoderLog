package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = (0 until 8).map { sc.next().toInt() }
    println(problem308a(s))
}

fun problem308a(s: List<Int>): String {
    for (i in 0 until s.size) {
        if (i == 7 || (s[i] <= s[i + 1])) {
            if (s[i] >= 100 && s[i] <= 675) {
                if (s[i] % 25 == 0) {

                } else {
                    return "No"
                }
            } else {
                return "No"
            }
        } else {
            return "No"
        }
    }
    return "Yes"
}