package abc

import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    val t = (0 until h).map { sc.next() }
    println(problem279c(h, w, s, t))
}

fun problem279c(h: Int, w: Int, s: List<String>, t: List<String>): String {
    val s2 = Array(w) { StringBuilder() }
    for (i in 0 until w) {
        for (j in 0 until h) {
            s2[i].append(s[j][i].toString())
        }
    }
    val t2 = Array(w) { StringBuilder() }
    for (i in 0 until w) {
        for (j in 0 until h) {
            t2[i].append(t[j][i].toString())
        }
    }
    val s3 = s2.map { it.toString() }
    val t3 = t2.map { it.toString() }
    return if (s3.sorted() == t3.sorted()) "Yes" else "No"
}