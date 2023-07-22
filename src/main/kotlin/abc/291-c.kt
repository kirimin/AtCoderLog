package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem291c(n, s))
}

fun problem291c(n: Int, s: String): String {
    val set = mutableSetOf<Pair<Int, Int>>()
    var x = 0
    var y = 0
    set.add(0 to 0)
    for (i in 0 until n) {
        val si = s[i]
        when (si) {
            'L' -> x--
            'R' -> x++
            'U' -> y++
            'D' -> y--
        }
        if (set.contains(x to y)) return "Yes"
        set.add(x to y)
    }
    return "No"
}