package past

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toCharArray().toList() }
    println(problem3f(n, a))
}

fun problem3f(n: Int, a: List<List<Char>>): String {
    val patterns = mutableListOf<String>()
    fun search(i: Int, left: String, right: String) {
        if(left != right.reversed()) {
            return
        }
        if (right.length + left.length >= n) {
            if (right.length + left.length == n + 1) {
                patterns.add(left.dropLast(1) + right)
            } else {
                patterns.add(left + right)
            }
            return
        }
        val ai = a[i]
        val aiR = a[n - i - 1]
        val list = ai.intersect(aiR.toList()).toList()
        for (j in 0 until list.size) {
            search(i + 1, left + list[j], list[j].toString() + right)
        }
    }
    search(0, "", "")
    return if (patterns.isNotEmpty()) patterns[0] else "-1"
}