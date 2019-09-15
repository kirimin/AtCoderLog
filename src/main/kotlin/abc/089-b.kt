package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem089b(n, s))
}

fun problem089b(n: Int, s: List<String>): String {
    val colorSet = hashSetOf<String>()
    for (i in 0 until n) {
        colorSet.add(s[i])
        if (colorSet.size == 4) return "Four"
    }
    return "Three"
}