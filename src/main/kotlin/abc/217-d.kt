package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val l = sc.nextLong()
    val q = sc.nextInt()
    val cx = (0 until q).map { sc.next().toInt() to sc.next().toLong() }
    println(problem217d(l, q, cx))
}

fun problem217d(l: Long, q: Int, cx: List<Pair<Int, Long>>): String {
    val ans = mutableListOf<Long>()
    val ts = TreeSet<Long> { x: Long, y: Long ->
        x.compareTo(y)
    }
    for (i in 0 until q) {
        val (c, x) = cx[i]
        when (c) {
            1 -> {
                ts.add(x)
            }
            2 -> {
                val left = ts.lower(x) ?: 0
                val right = l - (ts.higher(x) ?: l)
                ans.add((l - left) - right)
            }
        }
    }
    return ans.joinToString("\n")
}