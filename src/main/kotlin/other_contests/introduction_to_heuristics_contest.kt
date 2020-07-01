package other_contests

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val d = sc.nextInt()
    val c = (0 until 26).map { sc.next().toInt() }
    val s = (0 until d).map {
        (0 until 26).map { sc.next().toInt() }
    }
    println(problemintroduction_to_heuristics_contest(d, c, s))
}

fun problemintroduction_to_heuristics_contest(
    D: Int,
    c: List<Int>,
    s: List<List<Int>>
): String {
    val last = LongArray(26) { 0 }
    val satisfactions = LongArray(26) { 0 }
    val ans = IntArray(D) { 1 }
    for (d in 0 until D) {
        var max = -Long.MAX_VALUE
        var maxIndex = 0
        for (select in 0 until 26) {
            val plus = s[d][select].toLong()
            var minus = 0L
            for (other in 0 until 26) {
                if (select == other) {
                    continue
                }
                minus += c[other] * ((d + 1) - last[other])
            }
            max = Math.max(max, plus - minus)
            if (max <= plus - minus) maxIndex = select
        }
        val selected = maxIndex
        ans[d] = selected + 1
        satisfactions[selected] += s[d][selected].toLong()
        last[selected] = d + 1L
        for (j in 0 until 26) {
            satisfactions[j] -= c[j] * ((d + 1) - last[j])
        }
    }
//    debugLog(satisfactions.sum())
    return ans.joinToString("\n")
}