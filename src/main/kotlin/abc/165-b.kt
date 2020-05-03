package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    println(problem165b(x))
}

fun problem165b(x: Long): Long {
    var x2 = 100L
    var count = 0L
    while (true) {
        x2 = (x2 * 1.01).toLong()
        count++
        if (x2 >= x) return count
    }
}