package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem005c(n))
}

fun problem005c(n: Long): String {
    var n = n
    var ans = ""
    val list = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
    while (n != 0L) {
        val div = (n % 36).toInt()
        ans = list[div] + ans
        n /= 36
    }
    if (ans == "") return "0"
    return ans
}