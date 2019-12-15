package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val a3 = sc.nextInt()
    println(problem147a(a1, a2, a3))
}

fun problem147a(a1: Int, a2: Int, a3: Int): String {
    return if (a1 + a2 + a3 >= 22) {
        "bust"
    } else {
        "win"
    }
}