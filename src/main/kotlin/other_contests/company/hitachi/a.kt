package other_contests.company.hitachi

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problemHitachia(s))
}

fun problemHitachia(s: String): String {
    return when (s) {
        "hi", "hihi", "hihihi", "hihihihi", "hihihihihi" -> "Yes"
        else -> "No"
    }
}