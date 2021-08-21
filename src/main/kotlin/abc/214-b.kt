package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextInt()
    val t = sc.nextInt()
    println(problem214b(s, t))
}

fun problem214b(s: Int, t: Int): Int {
    var count = 0
    for (a in 0..100) {
        for (b in 0..100) {
            for (c in 0..100) {
                if (a + b + c <= s && a * b * c <= t) {
                    count++
                }
            }
        }
    }
    return count
}