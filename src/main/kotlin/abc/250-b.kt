package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem250b(n, a, b))
}

fun problem250b(n: Int, a: Int, b: Int): String {
    var prevTate = true
    var prevYoko = true
    val ans = Array(n * a) { "" }
    for (i in 0 until n * a) {
        prevYoko = prevTate
        for (j in 0 until n * b) {
            if (prevYoko) {
                ans[i] += "."
            } else {
                ans[i] += "#"
            }
            if ((j + 1) % b == 0) {
                prevYoko = !prevYoko
            }
        }
        if ((i + 1) % a == 0) {
            prevTate = !prevTate
        }
    }
    return ans.joinToString("\n")
}