package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem006b(s))
}

fun problem006b(s: String): String {
    var index = 0
    var count = 1
    while (s.length > index) {
        if (s.substring(index, index + 4) == "post") return count.toString()
        index += 4
        count++
    }
    return "none"
}