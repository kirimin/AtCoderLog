package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem093c(a, b, c))
}

fun problem093c(a: Int, b: Int, c: Int): Int {
    val list = listOf(a, b, c).sorted().toMutableList()
    var count = 0
    while (!list.all { it == list[2] }) {
        when {
            list[1] != list[2] -> {
                list[0]++
                list[1]++
            }
            list[2] - list[0] >= 2 -> {
                list[0] += 2
            }
            else -> {
                count++
                list[0]++
            }
        }
        count++
    }
    return count
}