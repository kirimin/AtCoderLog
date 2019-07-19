package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()

    val square1Size = a * b
    val square2Size = c * d

    val answer = Math.max(square1Size, square2Size)
    println(answer)
}