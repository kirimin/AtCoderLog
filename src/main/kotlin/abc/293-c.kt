package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { (0 until w).map { sc.next().toLong() } }
    println(problem293c(h, w, a))
}

fun problem293c(h: Int, w: Int, a: List<List<Long>>): Int {
    var count = 0
    fun function (y: Int, x: Int, used: MutableSet<Long>) {
        if (y < 0 || y >= h || x < 0 || x >= w) {
            return
        }
        if (used.contains(a[y][x])) {
            return
        }
        used.add(a[y][x])
        if (x == w - 1 && y == h - 1) {
            count++
            return
        }
        function(y + 1, x, used.toMutableSet())
        function(y, x + 1, used.toMutableSet())
    }
    function(0, 0, mutableSetOf())
    return count
}