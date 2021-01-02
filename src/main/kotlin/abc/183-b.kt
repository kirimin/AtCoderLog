package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val sx = sc.nextLong()
    val sy = sc.nextLong()
    val gz = sc.nextLong()
    val gy = sc.nextLong()
    println(problem183b(sx, sy, gz, gy))
}

fun problem183b(sx: Long, sy: Long, gx: Long, gy: Long): Double {

    return (sx * gy + gx * sy) / (gy + sy).toDouble()
}