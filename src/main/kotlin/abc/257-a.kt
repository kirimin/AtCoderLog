package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    println(problem257a(n, x))
}

fun problem257a(n: Int, x: Int): Char {
    val list = mutableListOf<Char>()
    for (c in 'A'..'Z') {
        for (i in 0 until n) {
            list.add(c)
        }
    }
    return list[x - 1]
}