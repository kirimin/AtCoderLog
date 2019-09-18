package abc

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val trains = (0 until n - 1).map { SpecialTrain(sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem084c(n, trains))
}

fun problem084c(n: Int, trains: List<SpecialTrain>): String {
    val ans = mutableListOf<Int>()
    for (i in 0 until n - 1) {
        var time = 0
        for (j in i until n - 1) {
            val tn = trains[j]
            when {
                time < tn.s -> time = tn.s
                time % tn.f == 0 -> {
                }
                else -> time = time + tn.f - time % tn.f
            }
            time += tn.c
        }
        ans.add(time)
    }
    return ans.joinToString("\n") + "\n0"
}

data class SpecialTrain(var c: Int, var s: Int, var f: Int)