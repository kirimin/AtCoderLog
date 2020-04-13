package abc

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { sc.next().toCharArray() }
    println(problem107b(h, w, a))
}

fun problem107b(h: Int, w: Int, a: List<CharArray>): String {
    val deletedH = mutableSetOf<Int>()
    val deletedW = mutableSetOf<Int>()
    val a = a.toTypedArray()
    for (i in 0 until h) {
        val ai = a[i]
        if (!ai.contains('#')) {
            deletedW.add(i)
        }
    }
    for (i in 0 until w) {
        val col = mutableListOf<Char>()
        for (j in 0 until h) {
            col.add(a[j][i])
        }
        if (!col.contains('#')) {
            deletedH.add(i)
        }
    }

    val sb = StringBuilder()
    for (i in 0 until h) {
        if (deletedW.contains(i)) continue
        for (j in 0 until w) {
            if (deletedH.contains(j)) continue
            sb.append(a[i][j])
        }
        sb.append("\n")
    }

    return sb.toString()
}