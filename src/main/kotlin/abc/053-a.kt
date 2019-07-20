package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val ans = if (x < 1200) {
        "ABC"
    } else {
        "ARC"
    }
    println(ans)
}