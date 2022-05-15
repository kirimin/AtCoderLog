package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem247c(n))
}

fun problem247c(n: Long): String {
    fun func(si: Long): String {
        if (si == 1L) {
            return si.toString()
        }
        return func(si - 1) + " " + si + " " + func(si - 1)
    }
    return func(n)
}