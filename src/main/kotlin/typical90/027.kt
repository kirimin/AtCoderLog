package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem027(n, s))
}

fun problem027(n: Int, s: List<String>): String {
    val set = mutableSetOf<String>()
    val ans = mutableListOf<Int>()
    for (i in 0 until n) {
        val si = s[i]
        if (!set.contains(si)) {
            ans.add(i + 1)
        }
        set.add(si)
    }
    return ans.joinToString("\n")
}