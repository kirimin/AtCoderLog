package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem314a(n))
}

fun problem314a(n: Int): String {
    return "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679".take(n + 2)
}