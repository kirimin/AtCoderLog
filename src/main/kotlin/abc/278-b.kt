package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val m = sc.nextInt()
    println(problem278b(h, m))
}

fun problem278b(h: Int, m: Int): String {
    for (i in 0 until 24) {
        for (j in 0 until 60) {
            var h = ((h + i) % 24)
            h += if ((m + j) / 60 == 1) 1 else 0
            h = if (h == 24) 0 else h
            var m = ((m + j) % 60)
            val h2 = if (h < 10) "0$h" else h.toString()
            val m2 = if (m < 10) "0$m" else m.toString()
            val a = h2.take(1)
            val b = h2.takeLast(1)
            val c = m2.take(1)
            val d = m2.takeLast(1)
            if ((a + c).toInt() in 0 .. 23 && (b + d).toInt() in 0 .. 59) return "$h $m"
        }
    }
    return ""
}