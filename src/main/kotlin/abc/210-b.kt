package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem210b(n, s))
}

fun problem210b(n: Int, s: String): String {
    var isTakahashi = true
    for (i in 0 until n) {
        if (s[i] == '1') {
            return if (isTakahashi) "Takahashi " else "Aoki"
        }
        isTakahashi = !isTakahashi
    }
    return if (isTakahashi) "Takahashi " else "Aoki"
}