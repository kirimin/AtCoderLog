package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem204a(x, y))
}

fun problem204a(x: Int, y: Int): Int {
    if (x == 0) {
        if (y == 0) {
            return 0
        } else if (y == 1) {
            return 2
        } else {
            return 1
        }
    }
    if (x == 1) {
        if (y == 1) {
            return 1
        } else if (y == 2) {
            return 0
        } else {
            return 2
        }
    }
    if (x == 2) {
        if (y == 2) {
            return 2
        } else if (y == 0) {
            return 1
        } else {
            return 0
        }
    }
    return 0
}