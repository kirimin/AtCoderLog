package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    val m = sc.nextInt()
    val t = (0 until m).map { sc.next() }
    println(problem091b(n, s, m, t))
}

fun problem091b(
    n: Int,
    s: List<String>,
    m: Int,
    t: List<String>
): Int {
    val sMap = s.groupBy { it }
    val tMap = t.groupBy { it }
    val map = mutableMapOf<String, Int>()
    sMap.forEach {
        map[it.key] = it.value.size - (tMap[it.key]?.size ?: 0)
    }
    val res = map.maxBy { it.value }!!.value
    return if (res < 0) 0 else res
}