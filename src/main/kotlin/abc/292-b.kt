package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val event = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem292b(n, q, event))
}

fun problem292b(n: Int, q: Int, event: List<Pair<Int, Int>>): String {
    val ans = mutableListOf<String>()
    val redList = mutableSetOf<Int>()
    val yellowList = mutableSetOf<Int>()
    for (i in 0 until q) {
        val (num, x) = event[i]
        when (num) {
            1 -> {
                if (yellowList.contains(x)) {
                    redList.add(x)
                } else {
                    yellowList.add(x)
                }
            }
            2 -> {
                redList.add(x)
            }
            3 -> {
                ans.add(if (redList.contains(x)) "Yes" else "No")
            }
        }
    }
    return ans.joinToString("\n")
}