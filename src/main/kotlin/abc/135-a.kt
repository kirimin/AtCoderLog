package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem135a(a,b))
}

fun problem135a(a: Long, b: Long): String {
    if ((a % 2 == 0L && b % 2 != 0L) || (a % 2 != 0L && b % 2 == 0L)) return "IMPOSSIBLE"
    if (a == 0L || b == 0L) return "IMPOSSIBLE"
    return ((a + b) / 2).toString()
}
