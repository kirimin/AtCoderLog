package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem173b(n, s))
}

fun problem173b(n: Int, s: List<String>): String {
    var ac = 0
    var wa = 0
    var tle = 0
    var re = 0
    for (i in 0 until n) {
        when (s[i]) {
            "AC" -> ac++
            "WA" -> wa++
            "TLE" -> tle++
            "RE" -> re++
        }
    }
    return "AC x $ac\n" +
            "WA x $wa\n" +
            "TLE x $tle\n" +
            "RE x $re"
}