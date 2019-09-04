package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem060b(a, b, c))
}

fun problem060b(a: Int, b: Int, c: Int): String {
    val list = mutableListOf<Int>()
    var count = 1
    while (true) {
        debugCount()
        list.add(a * 1)
        if (list.sum() % b == c) {
            return "YES"
        }
        count++
        if (list.sum() % b == 0) break
    }
    return "NO"
}