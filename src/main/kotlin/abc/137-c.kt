package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val s = (0 until n).map { sc.next() }
    println(problem137c(n, s))
}

fun problem137c(n: Long, s: List<String>): Long {
    var count = 0L
    val map = hashMapOf<List<Char>, Long>()
    val map2 = hashMapOf<List<Char>, Boolean>()
    s.forEachIndexed { i, si ->
        val tmp = si.toCharArray().sortedArray().toList()
        val c = map[tmp]
        if (c != null) {
            count += c + 1
            map[tmp] = c + 1
        } else if (map2[tmp] != null) {
            map[tmp] = 1
            count++
        }
        map2[tmp] = true
    }
    return count
}