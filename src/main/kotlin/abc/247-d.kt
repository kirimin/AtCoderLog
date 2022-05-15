package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val q = sc.nextInt()
    val query = (0 until q).map {
        val first = sc.next().toInt()
        if (first == 1) {
            Triple(first, sc.next().toLong(), sc.next().toLong())
        } else {
            Triple(first, sc.next().toLong(), -1L)
        }
    }
    println(problem247d(q, query))
}

fun problem247d(q: Int, query: List<Triple<Int, Long, Long>>): String {
    val ans = mutableListOf<String>()
    val que = ArrayDeque<MutableMap<Long, Long>>()
    for (i in 0 until q) {
//        debugLog(que)
        val first = query[i].first
        if (first == 1) {
            val x = query[i].second
            val c = query[i].third
            que.offer(mutableMapOf(x to c))
        } else {
            var c = query[i].second
            var sum = 0L
            while (true) {
                val current = que.peek()
                val num = current.keys.first()
                val count = current[num]!!
                if (count >= c) {
                    sum += num * c
                    current[num] = count - c
                    break
                } else {
                    sum += num * count
                    c -= count
                    que.poll()
                }
            }
            ans.add(sum.toString())
        }
    }
    return ans.joinToString("\n")
}