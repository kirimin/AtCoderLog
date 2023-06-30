package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem277b(n, s))
}

fun problem277b(n: Int, s: List<String>): String {
    if (s.toSet().size != s.size) return "No"
    val list1 = listOf("H", "D", "C", "S")
    val list2 = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K")
    for (i in 0 until s.size) {
        val si = s[i]
        if (!list1.contains(si[0].toString()) || !list2.contains(si[1].toString())) return "No"
    }
    return "Yes"
}