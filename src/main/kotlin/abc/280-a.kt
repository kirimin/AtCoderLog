package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    println(problem280a(h, w, s))
}

fun problem280a(h: Int, w: Int, s: List<String>): Int {
    return s.sumBy { it.count { it == '#' } }
}