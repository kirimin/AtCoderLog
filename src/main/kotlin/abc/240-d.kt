package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem240d(n, a))
}

fun problem240d(n: Int, a: List<Int>): String {
    val list = Stack<Pair<Int, Int>>()
    val ans = mutableListOf<Int>()
    var count = 0
    for (i in 0 until n) {
        val ai = a[i]
        if (list.isEmpty()) {
            list.push(ai to 1)
        } else {
            val last = list.peek()
            if (last.first == ai) {
                list.pop()
                list.push(last.first to last.second + 1)
            } else {
                list.push(ai to 1)
            }
        }
        count++
        val last = list.peek()
        if (last.first == last.second) {
            list.pop()
            count -= last.second
        }
        ans.add(count)
    }
    return ans.joinToString("\n")
}