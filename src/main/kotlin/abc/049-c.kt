package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem049c(s))
}

fun problem049c(s: String): String {
    val list = listOf("dreameraser", "dreamerase", "eraser", "dreamer", "erase", "dream")
    var t = s
    loop@ while (t.isNotBlank()) {
        for (word in list) {
            if (t.length >= word.length && t.take(word.length) == word) {
                t = t.drop(word.length)
                continue@loop
            }
        }
        return "NO"
    }
    return "YES"
}