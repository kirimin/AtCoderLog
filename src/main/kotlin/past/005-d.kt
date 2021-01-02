package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem005d(n, s))
}

fun problem005d(n: Int, s: List<String>): String {
    val r = Regex("0+")
    data class IntStr(val value: String): Comparable<IntStr> {
        override fun compareTo(other: IntStr): Int {
            val a = value.replaceFirst(r, "")
            val b = other.value.replaceFirst(r, "")
            if (a == b) {
                for (i in 0 until Math.min(value.length, other.value.length)) {
                    val ai = value[i]
                    val bi = other.value[i]
                    if (ai == '0' && bi != '0') return -1
                    if (ai != '0' && bi == '0') return 1
                    if (ai != '0' && bi != '0') return 0
                }
            } else {
                if (a.length == b.length) {
                    for (i in 0 until a.length) {
                        val ai = a[i]
                        val bi = b[i]
                        if (ai != bi) {
                            return ai.compareTo(bi)
                        }
                    }
                } else {
                    return a.length.compareTo(b.length)
                }
            }
            return other.value.compareTo(value)
        }

        override fun toString(): String {
            return value
        }
    }

    return s.map { IntStr(it) }.sorted().joinToString("\n")
}