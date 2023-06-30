package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem011a(x, a, b, c))
}

fun problem011a(x: Int, a: Int, b: Int, c: Int): String {
    var usagi = x / a.toDouble()
    val kame = x / b.toDouble()
    usagi += c
    return if (usagi == kame) "Tie" else if (usagi < kame) "Hare" else "Tortoise"
}