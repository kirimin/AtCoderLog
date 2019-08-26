package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem083b(n, a, b))
}

fun problem083b(n: Int, a: Int, b: Int): Int {
    var allSum = 0
    for (i in 1..n) {
        var sum = i.toString().takeLast(1).toInt()
        var n2 = i
        while (n2 >= 10) {
            n2 /= 10
            sum += n2.toString().takeLast(1).toInt()
        }
        if (sum in a..b) {
            allSum += i
        }
    }
    return allSum
}