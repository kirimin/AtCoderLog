package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until m).map { sc.next().toInt() }
    println(problem163b(n, m, a))
}

fun problem163b(n: Int, m: Int, a: List<Int>): Int {
    var sum = 0
    for (i in 0 until m) {
        val ai = a[i]
        sum += ai
    }
    return if (n - sum < 0) -1 else n - sum
}