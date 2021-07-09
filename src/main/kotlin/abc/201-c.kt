package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem201c(s))
}

fun problem201c(s: String): Long {
    var sum = 0L
    val maru = s.mapIndexed { index, c -> if (c == 'o') index else -1 }.filterNot { it == -1 }
    val hatena = s.mapIndexed { index, c -> if (c == '?') index else -1 }.filterNot { it == -1 }
    fun search(current: Int, pass: List<Int>) {
        if (current == 4) {
            for (i in 0 until maru.size) {
                if (!pass.contains(maru[i])) return
            }
            sum++
            return
        }
        for (i in 0 until maru.size) {
            search(current+1, pass + maru[i])
        }
        for (i in 0 until hatena.size) {
            search(current+1, pass + hatena[i])
        }
    }
    search(0, listOf())
    return sum
}