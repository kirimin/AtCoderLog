package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next() to sc.next() }
    val s = sc.next()
    val t = sc.next()
    println(problem011d(n, ab, s, t))
}

fun problem011d(n: Int, ab: List<Pair<String, String>>, s: String, t: String): String {
    fun search (current: String, target: String, map :Map<String, Set<String>>, already: Set<String>): Boolean {
        val set = map[current] ?: return false
        if (set.contains(target)) {
            return true
        }
        for (element in set) {
            if (already.contains(element)) continue
            val tmp = already.toMutableSet()
            tmp.add(element)
            if (search(element, target, map, tmp)) {
                return true
            }
        }
        return false
    }
    val map = mutableMapOf<String, MutableSet<String>>()
    for (i in 0 until n) {
        val (a, b) = ab[i]
        if (map[a] == null) {
            map[a] = mutableSetOf()
        }
        if (map[b] == null) {
            map[b] = mutableSetOf()
        }
        map[a]?.add(b)
        map[b]?.add(a)
    }
    for (i in 0 until s.length) {
        val si = s[i]
        val ti = t[i]
        if (si == ti) continue
        if (search(si.toString(), ti.toString(), map, mutableSetOf())) continue
        return "No"
    }
    return "Yes"
}