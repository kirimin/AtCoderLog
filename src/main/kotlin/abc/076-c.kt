package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem076c(s, t))
}

fun problem076c(s: String, t: String): String {
    val s = s.toCharArray()
    val t = t.toCharArray()
    var count = 0
    val tStartList = mutableListOf<Int>()
    while (true) {
        val size = tStartList.size
        for (i in 0 until s.size) {
            if (!tStartList.contains(i - count) && (s[i] == t[count] || s[i] == '?')) {
                count++
            } else {
                count = 0
            }
            if (count == t.size) {
                if (!tStartList.contains(i - count + 1)) {
                    tStartList.add(i - count + 1)
                    count = 0
                }
            }
        }
        if (size == tStartList.size) break
    }
    if (tStartList.isEmpty()) {
        return "UNRESTORABLE"
    }
    val resList = mutableListOf<String>()
    for (j in 0 until tStartList.size) {
        val tStart = tStartList[j]
        resList.add("")
        for (i in 0 until s.size) {
            val si = s[i]
            if (i >= tStart && i < tStart + t.size && si == '?') {
                resList[j] = resList[j] + t[i - tStart]
            } else if (si == '?') {
                resList[j] = resList[j] +  'a'
            } else {
                resList[j] = resList[j] +  si
            }
        }
    }
    return resList.sorted().first()
}