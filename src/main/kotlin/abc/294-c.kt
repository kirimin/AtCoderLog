package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until m).map { sc.next().toLong() }
    println(problem294c(n, m, a, b))
}

fun problem294c(n: Int, m: Int, a: List<Long>, b: List<Long>): String {
    val c = (a + b).sorted()
    val ansA = mutableListOf<Int>()
    var cPosition = 0
    for (i in 0 until n) {
        val ai = a[i]
        while (true) {
            if (c[cPosition] == ai) {
                ansA.add(cPosition + 1)
                break
            }
            cPosition++
        }
    }
    val ansB = mutableListOf<Int>()
    cPosition = 0
    for (i in 0 until m) {
        val bi = b[i]
        while (true) {
            if (c[cPosition] == bi) {
                ansB.add(cPosition + 1)
                break
            }
            cPosition++
        }
    }

    return ansA.joinToString(" ") + "\n" + ansB.joinToString(" ")
}