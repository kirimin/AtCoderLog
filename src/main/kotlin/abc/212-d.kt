package abc

import utilities.debugLog
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val q = sc.nextInt()
    val query = (0 until q).map {
        val a = sc.next().toInt()
        if (a != 3) {
            a to sc.next().toLong()
        } else {
            a to -1L
        }
    }
    println(problem212d(q, query))
}

fun problem212d(q: Int, query: List<Pair<Int, Long>>): String {
    val pq = PriorityQueue<BigInteger> { x: BigInteger, y: BigInteger ->
        x.compareTo(y)
    }
    var addSum = BigInteger.ZERO
    val ans = mutableListOf<BigInteger>()
    for (i in 0 until q) {
        val (a, x) = query[i]
        when (a) {
            1 -> {
                pq.offer(x.toBigInteger() - addSum)
            }
            2 -> {
                addSum += x.toBigInteger()
            }
            3 -> {
                ans.add(pq.poll() + addSum)
            }
        }
    }
    return ans.joinToString("\n")
}