package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val p = (0 until 26).map { sc.nextInt() }
    println(problem218b(p))
}

fun problem218b(n: List<Int>): String {
    val al = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
    var ans = ""
    for (i in 0 until n.size) {
        ans += al[n[i] - 1]
    }
    return ans
}