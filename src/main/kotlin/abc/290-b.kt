package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val s = sc.next()
    println(problem290b(n, k, s))
}

fun problem290b(n: Int, k: Int, s: String): String {
    var ans = ""
    var count = 0
    for (i in 0 until n) {
        if (s[i] == 'o') {
            if (count < k) {
                count++
                ans += "o"
            } else {
                ans += "x"
            }
        } else {
            ans += "x"
        }
    }
    return ans
}