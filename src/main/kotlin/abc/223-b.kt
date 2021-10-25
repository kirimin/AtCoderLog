package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem223b(s))
}

fun problem223b(s: String): String {
    var min = s
    var max = s
    var newStr = s
    for (i in 0 until s.length * 2) {
        val si = s[i % s.length]
        newStr = newStr.drop(1) + si
        if (newStr < min) {
            min = newStr
        }
        if (max < newStr) {
            max = newStr
        }
    }
    return "$min\n$max"
}