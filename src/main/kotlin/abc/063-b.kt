package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem063b(s))
}

fun problem063b(s: String): String {
    val hashSet = hashSetOf<Char>()
    for (i in s.indices) {
        if (hashSet.contains(s[i])) return "no"
        hashSet.add(s[i])
    }
    return "yes"
}