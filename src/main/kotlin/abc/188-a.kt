package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem188a(x, y))
}

fun problem188a(x: Int, y: Int): String {
    return if (Math.abs(x - y) < 3) "Yes" else "No"
}