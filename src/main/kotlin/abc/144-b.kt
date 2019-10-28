package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem144b(n))
}

fun problem144b(n: Int): String {
    for (i in 1..9) {
        for (j in 1..9) {
            if (i * j == n) return "Yes"
        }
    }
    return "No"
}