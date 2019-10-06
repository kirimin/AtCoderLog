package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextInt()
    val g = sc.nextInt()
    val b = sc.nextInt()
    println(problem064a(r, g, b))
}

fun problem064a(r: Int, g: Int, b: Int): String {
    return if ((r.toString() + g + b).toInt() % 4 == 0) "YES" else "NO"
}