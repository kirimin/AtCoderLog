package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val q = sc.nextInt()
    val a = (0 until k).map { sc.next().toInt() }
    val l = (0 until q).map { sc.next().toInt() }
    println(problem257b(n, k, q, a, l))
}

fun problem257b(n: Int, k: Int, q: Int, a: List<Int>, l: List<Int>): String {
    val comaPositions = a.toIntArray()
    for (i in 0 until q) {
        val li = l[i]
        val p = comaPositions[li - 1]
        if (p == n) continue
        if (comaPositions.last() != p && comaPositions[li] == p + 1) continue
        comaPositions[li - 1]++
    }
    return comaPositions.joinToString(" ")
}