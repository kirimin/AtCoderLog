package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextInt()
    println(problem145a(r))
}

fun problem145a(r: Int): Int {
    return (r * r)
}