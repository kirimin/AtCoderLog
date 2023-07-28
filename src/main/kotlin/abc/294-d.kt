package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val event = (0 until q).map {
        val a = sc.next().toInt()
        if (a == 2) {
            a to sc.next().toInt()
        } else {
            a to 0
        }
    }
    println(problem294d(n, q, event))
}

fun problem294d(n: Int, q: Int, event: List<Pair<Int, Int>>): String {
    // 宣言
    val all = TreeSet<Long> { x: Long, y: Long ->
        x.compareTo(y)
    }
    all.addAll((1L..n).toList())
    val ans = mutableListOf<Long>()
    val called = TreeSet<Long> { x: Long, y: Long ->
        x.compareTo(y)
    }
    for (i in 0 until q) {
        val (a, b) = event[i]
        when (a) {
            1 -> {
                val p = all.pollFirst()
                called.add(p)
            }
            2 -> {
                called.remove(b.toLong())
            }
            else -> {
                ans.add(called.first())
            }
        }
    }
    return ans.joinToString("\n")
}