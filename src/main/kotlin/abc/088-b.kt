package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem088b(n, a))
}

fun problem088b(n: Int, a: List<Int>): Int {
    var aSum = 0
    var bSum = 0
    var isAliceTurn = true
    a.sortedDescending().forEach {
        if (isAliceTurn) {
            aSum += it
        } else {
            bSum += it
        }
        isAliceTurn = !isAliceTurn
    }
    return aSum - bSum
}