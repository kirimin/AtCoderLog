package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem063a(a, b))
}

fun problem063a(a: Int, b: Int): String {
    return if (a + b >= 10) "error" else (a + b).toString()
}