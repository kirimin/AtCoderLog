package abc

import utilities.debugCount
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val ab = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem240c(n, x, ab))
}

fun problem240c(n: Int, x: Int, ab: List<Pair<Int, Int>>): String {
    var isYes = false
    val map = mutableSetOf<Pair<Int, Int>>()
    fun search(i : Int, num: Int) {
        if (map.contains(i to num)) {
            return
        }
        if (num > x) {
            return
        }
        map.add(i to num)
        if (i == n) {
            if (num == x) {
                isYes = true
            }
            return
        }
        val (a, b) = ab[i]
        search(i + 1, num + a)
        if (a != b) {
            search(i + 1, num + b)
        }
    }
    search(0, 0)
    return if (isYes) "Yes" else "No"
}
