package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val H = sc.nextInt()
    val W = sc.nextInt()
    val h = sc.nextInt()
    val w = sc.nextInt()
    println(problem121a(H, W, h, w))
}

fun problem121a(H: Int, W: Int, h: Int, w: Int): Int {
    return (H - h) * (W - w)
}