package arc

import utilities.debugLog
import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem001b(a, b))
}

fun problem001b(a: Int, b: Int): Int {
    var count = 0
    var current = a
    while (current != b) {
        when {
            b - current >= 8 -> {
                current += 10
                count++
            }
            current - b  >= 8 -> {
                current -= 10
                count++
            }
            b - current >= 3 -> {
                current += 5
                count++
            }
            current - b >= 3 -> {
                current -= 5
                count++
            }
            b - current >= 1 -> {
                current++
                count++
            }
            current - b >= 1 -> {
                current--
                count++
            }

        }
    }
    return count
}
