package other_contests.jsc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    val z = sc.nextInt()
    println(problem2021a(x, y, z))
}

fun problem2021a(x: Int, y: Int, z: Int): Int {
    val oneG = y / x.toDouble()
    val kakaku = oneG * z
    if (kakaku != kakaku.toInt().toDouble()) {
        return kakaku.toInt()
    } else {
        return kakaku.toInt() - 1
    }
}