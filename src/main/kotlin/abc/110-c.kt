package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem110c(s, t))
}

fun problem110c(s: String, t: String): String {
    var ok = true
    val ss = mutableMapOf<Char, Char>()
    val st = mutableMapOf<Char, Char>()
    for (i in 0 until s.length) {
        val si = s[i]
        val ti = t[i]
        debugLog(si, ti)
        if (ss.containsKey(si) && ss[si] != ti) ok = false
        if (st.containsKey(ti) && st[ti] != si) ok = false
        ss[si] = ti
        st[ti] = si
    }
    debugLog(ss)
    debugLog(st)
    return if (ok) "Yes" else "No"
}