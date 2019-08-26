package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val x = sc.nextInt()
    println(problem087b(a, b, c, x))
}

fun problem087b(a: Int, b: Int, c: Int, x: Int): Int {
    val fiveHundred = 500
    val hundred = 100
    val fifty = 50
    var count = 0
    for (i in 0..a) {
        for (j in 0..b) {
            for(k in 0..c) {
                if (fiveHundred * i + hundred * j + fifty * k == x) {
                    count++
                }
            }
        }
    }
    return count
}