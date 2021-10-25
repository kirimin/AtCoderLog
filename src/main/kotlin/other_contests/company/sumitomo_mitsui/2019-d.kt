package other_contests.company.sumitomo_mitsui

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem2019d(n, s))
}

fun problem2019d(n: Int, s: String): Int {
    val set = mutableSetOf<String>()
    val cache = mutableSetOf<String>()
    val cache2 = mutableSetOf<String>()
    for (a in 0 until n) {
        val one = s[a].toString()
        if (cache2.contains(one)) continue
        cache2.add(one)
        for (b in a + 1 until n) {
            val two = s[a].toString() + s[b]
            if (cache.contains(two)) continue
            cache.add(two)
            for (c in b + 1 until n) {
                val str = s[a].toString() + s[b] + s[c]
                set.add(str)
            }
        }
    }
    return set.size
}