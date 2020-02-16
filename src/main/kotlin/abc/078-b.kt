package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    val z = sc.nextInt()
    println(problem078b(x, y, z))
}

fun problem078b(x: Int, y: Int, z: Int): Int {
    var space = x - z
    var count = 0
    while (true) {
        if (space >= y + z) {
            space -= y + z
            count++
        } else {
            break
        }
    }
    return count
}