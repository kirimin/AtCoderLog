package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem170d(n, a))
}

fun problem170d(n: Int, a: List<Int>): Int {
    val max = a.max()!!
    val isValid = BooleanArray(max + 1)
    a.forEach { isValid[it] = true }

    for (ai in a.distinct().sorted()) {
        if (!isValid[ai]) continue
        var num = 2
        while (num <= max / ai) {
            isValid[num * ai] = false
            num++
        }
    }
    a.groupBy { it }.filter { it.value.size >= 2 }.forEach { t, _ -> isValid[t] = false }
    return isValid.count { it }
}