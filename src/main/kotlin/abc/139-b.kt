package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem139b(a, b))
}

fun problem139b(a: Int, b: Int): Int {
    var sum = 1
    var count = 0
    for (i in 1..20) {
        if (sum >= b) break
        sum += a - 1
        count++
    }
    return count
}