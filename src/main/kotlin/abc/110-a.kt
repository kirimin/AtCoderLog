package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem110(a, b, c))
}

fun problem110(a: Int, b: Int, c: Int): Int {
    val abc = listOf(a, b, c).sorted()
    return Integer.parseInt(abc[2].toString() + abc[1].toString()) + abc[0]
}