package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val x = sc.nextInt()
    val a = (0 until m).map { sc.next().toInt() }
    println(problem094b(n, m, x, a))
}

fun problem094b(n: Int, m: Int, x: Int, a: List<Int>): Int {
    val a = a.toSet()
    var leftSum = 0
    var rightSum = 0
    for (i in 1 until n) {
        if (!a.contains(i)) continue
        if (i < x) {
            leftSum++
        } else {
            rightSum++
        }
    }
    return Math.min(leftSum, rightSum)
}