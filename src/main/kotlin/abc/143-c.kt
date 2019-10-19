package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem143c(n, s))
}

fun problem143c(n: Int, s: String): Int {
    var ans = 1
    var current = s[0]
    for (i in 0 until n) {
        if (current != s[i]) {
            ans++
            current = s[i]
        }
    }
    return ans
}