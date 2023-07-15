package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val c = (0 until h).map { sc.next().toCharArray() }
    println(problem300c(h, w, c))
}

fun problem300c(h: Int, w: Int, c: List<CharArray>): String {
    val counts = IntArray(Math.min(h, w))
    val c2 = c.toMutableList()
    for (i in 0 until h) {
        c2[i] = ".${c2[i].joinToString("")}.".toCharArray()
    }
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (c2[i][j] == '#') {
                if (i != 0 && c2[i - 1][j - 1] == '#' || i != 0 && c2[i - 1][j + 1] == '#') continue
                if (i != h - 1 && c2[i + 1][j + 1] != '#') continue
                var i2 = i + 1
                var j2 = j + 1
                var count = 0
                while (i2 < h && j2 < w) {
                    if (c2[i2][j2] == '#') {
                        count++
                        i2++
                        j2++
                    } else {
                        break
                    }
                }
                counts[(count - 1) / 2]++
            }
        }
    }
    return counts.joinToString(" ")
}