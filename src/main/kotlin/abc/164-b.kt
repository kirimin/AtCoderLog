package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem164b(a, b, c, d))
}

fun problem164b(a: Int, b: Int, c: Int, d: Int): String {
    var tHp = a
    var aHp = c
    while (true) {
        aHp -= b
        if (aHp <= 0) return "Yes"
        tHp -= d
        if (tHp <= 0) return "No"
    }
}