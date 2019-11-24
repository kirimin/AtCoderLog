package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val x = sc.nextLong()
    println(problem146c(a, b, x))
}

fun problem146c(a: Long, b: Long, x: Long): Long {
    val max = 1000000000L
    var n = 0L
    var count = 0
    while (true) {
        count++
        val price = a * n + b * n.toString().length
        if (price >= x) {
            return if (n == 0L) return 0 else n - 1
        }
        val n2 = n * n
        val n3 = n * 100000000
        val n4 = n * 50000000
        val n5 = n * 20000000
        val n6 = n * 5000000
        val n7 = n * 100000
        val n8 = n * 10
        val n9 = n * 2
        if (n > 2L && a * n2 + b * n2.toString().length < x && n2 < max) {
            n = n2
        } else if(n > 2L && a * n3 + b * n3.toString().length < x && n3 < max) {
            n = n3
        } else if(n > 2L && a * n4 + b * n4.toString().length < x && n4 < max) {
            n = n4
        } else if(n > 2L && a * n5 + b * n5.toString().length < x && n5 < max) {
            n = n5
        } else if(n > 2L && a * n6 + b * n6.toString().length < x && n6 < max) {
            n = n6
        } else if(n > 2L && a * n7 + b * n7.toString().length < x && n7 < max) {
            n = n7
        } else if(n > 2L && a * n8 + b * n8.toString().length < x && n8 < max) {
            n = n8
        } else if(n > 2L && a * n9 + b * n9.toString().length < x && n9 < max) {
            n = n9
        } else {
            n++
        }
        if (n > max) return max
    }
}