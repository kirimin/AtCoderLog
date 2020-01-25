package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem071a(x, a, b))
}

fun problem071a(x: Int, a: Int, b: Int): String {
    return if (Math.abs(x - a) < Math.abs(x - b)) "A" else "B"
}