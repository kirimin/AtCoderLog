package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem190a(a, b, c))
}

fun problem190a(a: Int, b: Int, c: Int): String {
    var a = a
    var b = b
    var c = if (c == 1) 1 else 2
    while (true) {
        if (c % 2 == 0) {
            if (a == 0) return "Aoki"
            a--
        } else {
            if (b == 0) return "Takahashi"
            b--
        }
        c++
    }
}
