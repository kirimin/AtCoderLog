package other_contests.test

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextInt()
    val l = sc.nextInt()
    val r = sc.nextInt()
    println(problem202004a(s, l, r))
}

fun problem202004a(s: Int, l: Int, r: Int): Int {
    if (s in (l..r)) return s
    return if (s < l) l else r
}