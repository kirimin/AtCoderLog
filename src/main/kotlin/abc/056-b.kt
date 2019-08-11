package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val w = sc.next().toLong()
    val a = sc.next().toLong()
    val b = sc.next().toLong()
    println(problem56b(w, a, b))
}

fun problem56b(w: Long, a: Long, b: Long): Long {
    val aRight = a + w
    val bRight = b + w
    return when {
        aRight < b -> b - aRight
        bRight < a -> a - bRight
        else -> 0
    }
}

//□□■■■□□□□
//□□□□□■■■□