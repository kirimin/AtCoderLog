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
            time += if (time <= tn.s) {
                tn.s - time + tn.c
            } else {
                var wait = tn.s
                while (wait < time) {
                    wait += tn.f
                    when {
                        wait + tn.f * 950000 < time -> wait += +tn.f * 950000
                        wait + tn.f * 900000 < time -> wait += +tn.f * 900000
                        wait + tn.f * 800000 < time -> wait += +tn.f * 800000
                        wait + tn.f * 500000 < time -> wait += +tn.f * 500000
                        wait + tn.f * 100000 < time -> wait += +tn.f * 100000
                        wait + tn.f * 50000 < time -> wait += +tn.f * 50000
                        wait + tn.f * 10000 < time -> wait += +tn.f * 10000
                        wait + tn.f * 5000 < time -> wait += +tn.f * 5000
                        wait + tn.f * 1000 < time -> wait += +tn.f * 1000
                        wait + tn.f * 500 < time -> wait += +tn.f * 500
                        wait + tn.f * 100 < time -> wait += +tn.f * 100
                    }
                }
                wait % time + tn.c
            }
        }
        ans.add(time)
    }
    return ans.joinToString("\n") + "\n0"
}

data class SpecialTrain(var c: Int, var s: Int, var f: Int)