package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    print(s.map { if (it == ',')  ' ' else it }.joinToString(""))
}