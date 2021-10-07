package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem219a(x))
}

fun problem219a(x: Int): String {
    return if (x < 40) (40 - x).toString() else if (x < 70) (70 - x).toString() else if (x < 90) (90 - x).toString() else "expert"
}