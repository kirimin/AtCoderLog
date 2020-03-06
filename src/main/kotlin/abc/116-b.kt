package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextInt()
    println(problem116b(s))
}

fun problem116b(s: Int): Int {
    fun f(n: Int): Int {
        return if (n % 2 == 0) n / 2 else 3 * n + 1
    }
    val a = mutableListOf<Int>()
    a.add(s)
    for (i in 1..Math.pow(10.0, 6.0).toInt()) {
        val f = f(a[i - 1])
        if (a.contains(f)) return i + 1
        a.add(f)
    }
    return 0
}