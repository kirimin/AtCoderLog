package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()
    val f = sc.nextInt()
    val x = sc.nextInt()
    println(problem249a(a, b, c, d, e, f, x))
}

fun problem249a(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, x: Int): String {
    var takahashi = 0
    var aoki = 0
    var tCount = 0
    var aCount = 0
    var tRest = 0
    var aRest = 0
    for (i in 0 until x) {
        if (tCount < a) {
            tCount++
            takahashi += b
        } else {
            tRest++
            if (tRest == c) {
                tCount = 0
                tRest = 0
            }
        }
        if (aCount < d) {
            aCount++
            aoki += e
        } else {
            aRest++
            if (aRest == f) {
                aCount = 0
                aRest = 0
            }
        }
    }
    return if (takahashi == aoki) "Draw" else if (takahashi > aoki) "Takahashi" else "Aoki"
}