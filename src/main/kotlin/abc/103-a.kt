package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val a3 = sc.nextInt()
    println(problem103a(a1, a2, a3))
}

fun problem103a(a1: Int, a2: Int, a3: Int): Int {
    val a = listOf(a1, a2, a3).sorted()
    return (a[2] - a[1]) + (a[1] - a[0])
}