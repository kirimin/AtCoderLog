package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = sc.next()
    println(problem244b(n, t))
}

fun problem244b(n: Int, t: String): String {
    var direction = 0
    var x = 0
    var y = 0
    for (i in 0 until n) {
        val ti = t[i]
        when (ti) {
            'S' -> {
                if (direction == 0) {
                    x++
                } else if (direction == 1) {
                    y--
                } else if (direction == 2) {
                    x--
                } else {
                    y++
                }
            }
            'R' -> {
                direction++
                if (direction == 4) {
                    direction = 0
                }
            }
        }
    }
    return "$x $y"
}