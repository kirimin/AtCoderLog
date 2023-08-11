package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val c = (0 until h).map { sc.next() }
    println(problem274b(h, w, c))
}

fun problem274b(h: Int, w: Int, c: List<String>): String {
    val c2 = Array(w) { CharArray(h) { ' ' } }
    for (i in 0 until h) {
        for (j in 0 until w) {
            c2[j][i] = c[i][j]
        }
    }
    return c2.map { it.count { it == '#' } }.joinToString(" ")
}