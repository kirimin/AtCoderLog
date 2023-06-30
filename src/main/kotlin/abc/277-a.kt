package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem277a(n, x, p))
}

fun problem277a(n: Int, x: Int, p: List<Int>): Int {
    return p.indexOf(x) + 1
}