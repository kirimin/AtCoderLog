package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = (0 until 3).map { (0 until 3).map { sc.next().toInt() } }
    val n = sc.nextInt()
    val b = (0 until n).map { sc.next().toInt() }
    println(problem157b(a, n, b))
}

fun problem157b(
    a: List<List<Int>>,
    n: Int,
    b: List<Int>
): String {
    val b = b.toHashSet()
    val list = Array(3) { IntArray(3) { 0 } }
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            val ij = a[i][j]
            if (b.contains(ij)) {
                list[i][j] = 1
            }
        }
    }
    return when {
        list[0][0] == 1 && list[0][1] == 1 && list[0][2] == 1 -> "Yes"
        list[1][0] == 1 && list[1][1] == 1 && list[1][2] == 1 -> "Yes"
        list[2][0] == 1 && list[2][1] == 1 && list[2][2] == 1 -> "Yes"

        list[0][0] == 1 && list[1][0] == 1 && list[2][0] == 1 -> "Yes"
        list[0][1] == 1 && list[1][1] == 1 && list[2][1] == 1 -> "Yes"
        list[0][2] == 1 && list[1][2] == 1 && list[2][2] == 1 -> "Yes"

        list[0][0] == 1 && list[1][1] == 1 && list[2][2] == 1 -> "Yes"
        list[0][2] == 1 && list[1][1] == 1 && list[2][0] == 1 -> "Yes"
        else -> "No"
    }
}