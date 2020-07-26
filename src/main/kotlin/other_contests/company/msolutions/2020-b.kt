package other_contests.company.msolutions

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val k = sc.nextInt()
    println(problem2020b(a, b, c, k))
}

fun problem2020b(a: Int, b: Int, c: Int, k: Int): String {
    var red = a
    var green = b
    var blue = c
    for (i in 0 until k) {
        if (red >= green) {
            green *= 2
        } else if (green >= blue) {
            blue *= 2
        }
        if (red < green && green < blue) return "Yes"
    }
    return "No"
}