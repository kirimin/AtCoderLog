package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = sc.nextInt()
    val q = sc.nextInt()
    val r = sc.nextInt()
    val s = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem286a(n, p, q, r, s, a))
}

fun problem286a(n: Int, p: Int, q: Int, r: Int, s: Int, a: List<Int>): String {
    val ans = mutableListOf<Int>()
    val pq = ArrayDeque<Int>()
    val rs = ArrayDeque<Int>()
    for (i in 0 until n) {
        if (i + 1 in p..q) {
            pq.add(a[i])
        }
    }
    for (i in 0 until n) {
        if (i + 1 in r..s) {
            rs.add(a[i])
        }
    }
    for (i in 0 until n) {
        if (i + 1 in p..q) {
            ans.add(rs.pollFirst())
        } else if (i + 1 in r..s) {
            ans.add(pq.pollFirst())
        } else {
            ans.add(a[i])
        }
    }
    return ans.joinToString(" ")
}