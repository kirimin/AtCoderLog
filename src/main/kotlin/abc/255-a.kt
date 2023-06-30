package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextInt()
    val c = sc.nextInt()
    val a = (0 until 2).map { (0 until 2).map { sc.next().toInt() } }
    println(problem255a(r, c, a))
}

fun problem255a(r: Int, c: Int, a: List<List<Int>>): Int {
    return a[r - 1][c - 1]
}