package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    println(problem258a(k))
}

fun problem258a(k: Int): String {
    var tmp = (k % 60).toString()
    if (tmp.length == 1) tmp = "0$tmp"
    return (21 + k / 60).toString() + ":" + tmp
}