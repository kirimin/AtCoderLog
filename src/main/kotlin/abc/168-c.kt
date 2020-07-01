package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val h = sc.nextInt()
    val m = sc.nextInt()
    println(problem168c(a, b, h, m))
}

fun problem168c(a: Int, b: Int, h: Int, m: Int): Double {
    val alpha = (h * 60 + m).toDouble() / 720 * (Math.PI * 2)
    val beta = m.toDouble() / 60 * (Math.PI * 2)
    debugLog(m.toDouble() / 60, beta)
    val xA = a * Math.cos(alpha)
    val yA = a * Math.sin(alpha)
    val xB = b * Math.cos(beta)
    val yB = b * Math.sin(beta)
    return Math.sqrt((xA - xB) * (xA - xB) + (yA - yB) * (yA - yB))
}