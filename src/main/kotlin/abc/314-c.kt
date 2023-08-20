package abc

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val s = sc.next()
    val c = (0 until n).map { sc.next().toInt() }
    println(problem314c(n, m, s, c))
}

fun problem314c(n: Int, m: Int, s: String, c: List<Int>): String {
    val queueArray =Array(m) { ArrayDeque<Char>() }
    for (i in 0 until n) {
        queueArray[c[i] - 1].add(s[i])
    }
    for (i in 0 until m) {
        val tmp = queueArray[i].pollLast()
        queueArray[i].addFirst(tmp)
    }
    val ans = StringBuilder()
    for (i in 0 until n) {
        ans.append(queueArray[c[i] - 1].pollFirst())
    }
    return ans.toString()
}