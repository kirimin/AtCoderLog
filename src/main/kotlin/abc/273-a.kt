package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem273a(n))
}

fun problem273a(n: Int): Int {
    fun f(x: Int): Int {
        if (x == 0) return 1
        return x * f(x - 1)
    }
    return f(n)
}