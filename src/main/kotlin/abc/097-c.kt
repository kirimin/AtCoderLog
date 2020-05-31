package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val k = sc.nextInt()
    println(problem097c(s, k))
}

fun problem097c(s: String, k: Int): String {
    val set = mutableSetOf<String>()
    fun subStringGenerator(current: String, index: Int) {
        set.add(current)
        if (index == s.length - 1) return
        if (current.length > k) return
        if (current.length == 1) {
            subStringGenerator(s[index + 1].toString(), index + 1)
        }
        subStringGenerator(current + s[index + 1], index + 1)
    }
    subStringGenerator(s[0].toString(), 0)
    return set.sorted()[k - 1]
}