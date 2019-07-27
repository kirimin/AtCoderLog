package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    if (s.groupBy { it }.filter { it.value.size == 2 }.size == 2) {
        println("Yes")
    } else {
        println("No")
    }
}