package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = (0 until n).map { sc.next().toInt() }
    println(problem085b(n, d))
}

fun problem085b(n: Int, d: List<Int>): Int {
    var count = 0
    var currentSize = Integer.MAX_VALUE
    d.sortedDescending().forEach {
        if (currentSize != it) {
            count++
        }
        currentSize = it
    }
    return count
}