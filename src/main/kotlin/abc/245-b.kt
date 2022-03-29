package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem245b(n, a))
}

fun problem245b(n: Int, a: List<Int>): Int {
    val a = a.toSet()
    for (i in 0.. 2001) {
        if (!a.contains(i)) {
            return i
        }
    }
    return 2001
}