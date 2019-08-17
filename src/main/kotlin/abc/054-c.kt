package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val m = sc.next().toInt()
    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()
    repeat((0 until m).count()) {
        a.add(sc.next().toInt())
        b.add(sc.next().toInt())
    }
    println(problem54c(n, m, a, b))
}

fun problem54c(n: Int, m: Int, a: List<Int>, b: List<Int>): Int {
    var count = 0
    fun dfs(v: Int, past: HashSet<Int>) {
//        debugLog("v", v, "past", past)
//        debugLog("if", past.sorted(), (a + b).toHashSet().sorted())
        if (past.sorted() == (a + b).toHashSet().sorted()) {
//            debugLog("success")
            count++
            return
        }
        val nextList = mutableListOf<Int>()
        (0 until m).forEach { i ->
            val ai = a[i]
            if (!past.contains(ai) && v == b[i]) {
                nextList.add(ai)
            }
            val bi = b[i]
            if (!past.contains(bi) && v == a[i]) {
                nextList.add(bi)
            }
        }
//        debugLog("nextList", nextList)
        for(next in nextList) {
            if (past.contains(next)) continue
            past.add(next)
            dfs(next, past.toHashSet())
            past.remove(next)
        }
    }
    dfs(1, hashSetOf(1))
    return count
}