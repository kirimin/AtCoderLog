package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem148a(a, b))
}

fun problem148a(a: Int, b: Int): Int {
    if ((a == 1 || b == 1) && (a == 2 || b == 2)) {
        return 3
    } else if ((a == 1 || b == 1) && (a == 3 || b == 3)) {
        return 2
    } else if ((a == 2 || b == 2) && (a == 3 || b == 3)) {
        return 1
    }
    return 0
}