package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem170b(x, y))
}

fun problem170b(x: Int, y: Int): String {
    if (y % 4 == 0 || y % 4 == 2) {
        if (x * 4 >= y && x * 2 <= y) return "Yes"
    }
    return "No"
}