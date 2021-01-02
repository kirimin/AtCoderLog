package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val s = sc.next()
    println(problem184b(n, x, s))
}

fun problem184b(n: Int, x: Int, s: String): Int {
    var ans = x
    for (i in s) {
        if (i == 'o') {
            ans++
        } else {
            ans = Math.max(0, ans - 1)
        }
    }
    return ans
}