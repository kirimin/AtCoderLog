package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val r = sc.nextInt()
    val c = sc.nextInt()
    println(problem250a(h, w, r, c))
}

fun problem250a(h: Int, w: Int, r: Int, c: Int): Int {
    val tate = if (h == 1) 0 else if ( h == r || r == 1) 1 else 2
    val yoko = if (w == 1) 0 else if ( w == c || c == 1) 1 else 2
    return tate + yoko
}