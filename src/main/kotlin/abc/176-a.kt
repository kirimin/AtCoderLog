package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val t = sc.nextInt()
    println(problem176a(n, x, t))
}

fun problem176a(n: Int, x: Int, t: Int): Int {
    var sum = 0
    var time = 0
    while (sum < n) {
        sum += x
        time += t
    }
    return time
}