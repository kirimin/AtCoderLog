package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem299c(n, s))
}

fun problem299c(n: Int, s: String): Int {
    var haihun = false
    var max = 0
    var count = 0
    for (i in 0 until n) {
        if (s[i] == '-') {
            haihun = true
            count = 0
        }
        if (s[i] == 'o') {
            if (haihun) {
                count++
            }
            max = Math.max(max, count)
        }
    }
    haihun = false
    count = 0
    for (i in n - 1 downTo 0) {
        if (s[i] == '-') {
            haihun = true
            count = 0
        }
        if (s[i] == 'o') {
            if (haihun) {
                count++
            }
            max = Math.max(max, count)
        }
    }
    return if (max == 0) -1 else max
}