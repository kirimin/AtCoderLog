package abc

import utilities.debugLog
import java.util.*
import kotlin.collections.HashSet

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val ab = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    val k = sc.nextInt()
    val cd = (0 until k).map { sc.next().toInt() to sc.next().toInt() }
    println(problem190c(n, m, ab, k, cd))
}

fun problem190c(n: Int, m: Int, ab: List<Pair<Int, Int>>, k: Int, cd: List<Pair<Int, Int>>): Int {
    fun integerToList(bit: Int, n:Int): List<Int> {
        val s = mutableListOf<Int>()
        for(i in 0 until n) {
            if (bit and (1 shl i) != 0) {
                s.add(i)
            }
        }
        return s
    }

    var bit = 0
    var max = 0
    while(bit < (1 shl k)) {
        val s = integerToList(bit, k).toHashSet()
        val balls = HashSet<Int>()
        for (i in 0 until k) {
            if (s.contains(i)) {
                balls.add(cd[i].second)
            } else {
                balls.add(cd[i].first)
            }
        }
        var count = 0
        for (i in 0 until m) {
            val (a, b) = ab[i]
            if (balls.contains(a) && balls.contains(b)) count++
        }
        max = Math.max(max, count)
        bit++
    }
    return max
}