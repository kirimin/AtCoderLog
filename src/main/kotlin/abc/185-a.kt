package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val a3 = sc.nextInt()
    val a4 = sc.nextInt()
    println(problem185a(a1, a2, a3, a4))
}

fun problem185a(a1: Int, a2: Int, a3: Int, a4: Int): Int {
    return listOf(a1, a2, a3, a4).min()!!
}