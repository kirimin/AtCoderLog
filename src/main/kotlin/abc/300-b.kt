package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { sc.next().toCharArray() }
    val b = (0 until h).map { sc.next().toCharArray() }
    println(problem300b(h, w, a, b))
}

fun problem300b(h: Int, w: Int, a: List<CharArray>, b: List<CharArray>): String {
    for (s in 0 until 30) {
        for (t in 0 until 30) {
            val changed = mutableListOf<CharArray>()
            for (i in 0 until h) {
                changed.add(CharArray(w))
                for (j in 0 until w) {
                    changed[i][j] = a[(i + s) % h][(j + t) % w]
                }
            }
            if (changed.map { it.joinToString("") }.joinToString("\n") == b.map { it.joinToString("") }.joinToString("\n")) return "Yes"
        }
    }
    return "No"
}