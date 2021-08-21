package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem134d(n, a))
}

fun problem134d(n: Int, a: List<Int>): String {
    val ans = mutableListOf<Int>()
    val hasBool = BooleanArray(n + 1)

    for (i in n downTo 1) {
        val ai = a[i - 1]
        var count = 0
        for (j in i + i..n step i) {
            if (hasBool[j]) count++
        }
        if (count % 2 != ai) {
            hasBool[i] = true
            ans.add(i)
        }
    }
    return ans.size.toString() + "\n" + ans.joinToString("\n")
}