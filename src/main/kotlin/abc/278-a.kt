package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem278a(n, k, a))
}

fun problem278a(n: Int, k: Int, a: List<Int>): String {
    val ans = ArrayDeque<Int>(a)
    for (i in 0 until k) {
        ans.removeFirst()
        ans.addLast(0)
    }
    return ans.joinToString(" ")
}