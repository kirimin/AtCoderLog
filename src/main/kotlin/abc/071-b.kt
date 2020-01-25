package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem071b(s))
}

fun problem071b(s: String): String {
    val alphabets = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")
    val set = mutableSetOf<String>()
    for (c in s) {
        set.add(c.toString())
    }
    for (i in alphabets.indices) {
        if (!set.contains(alphabets[i])) {
            return alphabets[i]
        }
    }
    return "None"
}