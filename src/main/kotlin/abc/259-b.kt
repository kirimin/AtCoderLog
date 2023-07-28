package abc

import java.awt.geom.AffineTransform
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val d = sc.nextInt()
    println(problem259b(a, b, d))
}

fun problem259b(a: Int, b: Int, d: Int): String {
    val d = Math.toRadians(d.toDouble())
    val x = a * Math.cos(d.toDouble()) - b * Math.sin(d.toDouble())
    val y = a * Math.sin(d.toDouble()) + b * Math.cos(d.toDouble())
    return "$x $y"
}