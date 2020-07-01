package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem171c(n))
}

fun problem171c(n: Long): String {
    val alphabets = arrayOf(
        "z",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z"
    )
    var n = n
    var ans = ""
    while (true) {
        ans = alphabets[(n % 26).toInt()] + ans
        if (n % 26 == 0L) n--
        if (n / 26 == 0L) break
        n /= 26L
    }
    return ans
}