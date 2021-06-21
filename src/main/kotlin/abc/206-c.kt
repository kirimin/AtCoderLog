package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem206c(n, a))
}

fun problem206c(n: Int, a: List<Long>): Long {
    val grouped = a.groupBy { it }
    var count = 0.0
    for (map in grouped) {
        val size = map.value.size
        count += (n - size) * (size * 0.5)
    }
    return count.toLong()
}