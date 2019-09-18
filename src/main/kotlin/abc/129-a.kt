package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val p = sc.nextInt()
    val q = sc.nextInt()
    val r = sc.nextInt()
    println(problem129a(p, q, r))
}

fun problem129a(p: Int, q: Int, r: Int): Int {
    return Math.min(Math.min(p + q, p + r), q + r)
}