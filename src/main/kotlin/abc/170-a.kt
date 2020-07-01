package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x1 = sc.nextInt()
    val x2 = sc.nextInt()
    val x3 = sc.nextInt()
    val x4 = sc.nextInt()
    val x5 = sc.nextInt()
    println(problem170a(x1, x2, x3, x4, x5))
}

fun problem170a(x1: Int, x2: Int, x3: Int, x4: Int, x5: Int): Int {
    return when {
        x1 == 0 -> return 1
        x2 == 0 -> return 2
        x3 == 0 -> return 3
        x4 == 0 -> return 4
        x5 == 0 -> return 5
        else -> 0
    }
}