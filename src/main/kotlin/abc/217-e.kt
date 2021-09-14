package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val q = sc.nextInt()
    val x = (0 until q).map {
        val a = sc.next().toInt()
        if (a == 1) {
            a to sc.next().toLong()
        } else {
            a to 0L
        }
    }
    println(problem217e(q, x))
}

fun problem217e(q: Int, x: List<Pair<Int, Long>>): String {
    val ans = mutableListOf<Long>()
    val firstList = mutableListOf<Long>()
    val ts = PriorityQueue<Long> { x: Long, y: Long ->
        x.compareTo(y)
    }
    val ts2 = ArrayDeque<Long>()
    loop@ for (i in 0 until q) {
        val (qi, xi) = x[i]
        when (qi) {
            1 -> {
                ts2.add(xi)
                firstList.add(xi)
            }
            2 -> {
                if (ts.isNotEmpty()) {
                    ans.add(ts.first())
                    ts.remove(ts.first())
                } else {
                    ans.add(ts2.first())
                    ts2.remove(ts2.first())
                }
            }
            3 -> {
                ts.addAll(ts2)
                ts2.clear()
            }
        }
    }
    return ans.joinToString("\n")
}