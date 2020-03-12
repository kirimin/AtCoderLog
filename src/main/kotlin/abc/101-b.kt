package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem101b(n))
}

fun problem101b(n: Long): String {
    val nStr = n.toString()
    var sn = 0
    nStr.forEach {
        sn += it.toString().toInt()
    }
    return if (n % sn == 0L) "Yes" else "No"
}