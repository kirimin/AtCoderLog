package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem293b(n, a))
}

fun problem293b(n: Int, a: List<Int>): String {
    val called = mutableSetOf<Int>()
    val ans = mutableListOf<Int>()
    var count = 0
    for (i in 0 until n) {
        if (!called.contains(i + 1)) {
            called.add(a[i])
        }
    }
    for (i in 1 .. n) {
        if (!called.contains(i)) {
            ans.add(i)
        }
    }
    return ans.size.toString() + "\n" + ans.joinToString(" ")
}