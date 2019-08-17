package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val o = sc.next()
    val e = sc.next()
    println(problem058b(o, e))
}

fun problem058b(o: String, e: String): String {
    val length = Math.max(o.length, e.length)
    var result = ""
    (0 until length).forEach { i ->
        if (o.length > i) {
            result += o[i]
        }
        if (e.length > i) {
            result += e[i]
        }
    }
    return result
}