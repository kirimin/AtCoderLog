package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val h = sc.nextInt()
    val k = sc.nextInt()
    val s = sc.next()
    val xy = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem303c(n, m, h, k, s, xy))
}

fun problem303c(n: Int, m: Int, h: Int, k: Int, s: String, xy: List<Pair<Int, Int>>): String {
    var x = 0
    var y = 0
    var health = h
    val xy = xy.toMutableSet()
    for (i in 0 until n) {
        health -= 1
        if (health < 0) return "No"
        when (s[i]) {
            'R' -> x += 1
            'L' -> x -= 1
            'U' -> y += 1
            'D' -> y -= 1
        }
        if (xy.contains(x to y)) {
            if (health < k) {
                health = k
                xy.remove(x to y)
            }
        }
    }
    return "Yes"
}