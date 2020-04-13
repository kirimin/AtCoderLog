package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    val z = sc.nextInt()
    println(problem161a(x, y, z))
}

fun problem161a(x: Int, y: Int, z: Int): String {
    var a = y
    var b = x
    var c = z
    return "$c $b $a"
}