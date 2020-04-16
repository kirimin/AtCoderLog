package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val X = sc.nextInt()
    val Y = sc.nextInt()
    val x = (0 until n).map { sc.next().toInt() }
    val y = (0 until m).map { sc.next().toInt() }
    println(problem110b(n, m, X, Y, x, y))
}

fun problem110b(
    n: Int,
    m: Int,
    X: Int,
    Y: Int,
    x: List<Int>,
    y: List<Int>
): String {
    val xMax = x.max()!!
    val yMin = y.min()!!
    for (z in -100..101) {
        if (X < z && z <= Y && xMax < z && yMin >= z) {
            return "No War"
        }
    }
    return "War"
}