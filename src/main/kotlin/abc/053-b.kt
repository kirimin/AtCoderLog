package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()

    if (x <= 6) {
        println(1)
        return
    }
    if (x <= 11) {
        println(2)
        return
    }
    var ans = x / (6 + 5) * 2
    val amari = x % 11
    if (amari > 6L) {
        ans += 2
    } else if (amari > 0L) {
       ans += 1
    }
    println(ans)
}