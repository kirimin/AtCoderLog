package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val q = sc.nextInt()
    val bc = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem171d(n, a, q, bc))
}

fun problem171d(
    n: Int,
    a: List<Int>,
    q: Int,
    bc: List<Pair<Int, Int>>
): String {
    val ans = mutableListOf<Long>()
    var sum = 0L
    for (i in 0 until n) {
        sum += a[i]
    }
    ans.add(sum)
    val counts = mutableMapOf<Int, Int>()
    for (i in 0 until n) {
        val ai = a[i]
        if (counts[ai] == null) {
            counts[ai] = 0
        }
        counts[ai] = counts[ai]!!.plus(1)
    }
   for (i in 0 until q) {
       val (b, c) = bc[i]
       if (counts[b] == null) {
           ans.add(ans.last())
           continue
       }
       val bC = counts[b]!!
       val cC = counts[c]
       counts[c] = (cC ?: 0) + bC
       counts[b] = 0
       var s = ans.last()
       s -= b.toLong() * bC
       s += c.toLong() * bC
       ans.add(s)
   }
    return ans.drop(1).joinToString("\n")
}