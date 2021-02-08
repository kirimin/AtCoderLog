package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val ab = (0 until n - 1).map { sc.next().toInt() to sc.next().toInt() }
    val px = (0 until q).map { sc.next().toInt() to sc.next().toLong() }
    println(problem138d(n, q, ab, px))
}

fun problem138d(n: Int, q: Int, ab: List<Pair<Int, Int>>, px: List<Pair<Int, Long>>): String {
    val ki = Array<MutableList<Int>>(n) { mutableListOf() }
    for (i in 0 until n - 1) {
        val (a, b) = ab[i]
        ki[a - 1].add(b - 1)
        ki[b - 1].add(a - 1)
    }
    val values = LongArray(n) { 0 }
    for (i in 0 until q) {
        val (p, x) = px[i]
        values[p - 1] += x
    }

    val ans = LongArray(n) { -1 }
    val queue = ArrayDeque<Int>()
    queue.offer(0)
    ans[0] = values[0]
    while(!queue.isEmpty()) {
        val current = queue.poll()
        val value = ans[current]
        for (i in 0 until ki[current].size) {
            val children = ki[current][i]
            if (ans[children] != -1L) continue
            val childrenValue = value + values[children]
            ans[children] = childrenValue
            queue.offer(children)
        }
    }
    return ans.joinToString(" ")
}