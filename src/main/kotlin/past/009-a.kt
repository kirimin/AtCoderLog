package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val H = sc.nextInt()
    val W = sc.nextInt()
    val h = sc.nextInt()
    val w = sc.nextInt()
    println(problem009a(H, W, h, w))
}

fun problem009a(H: Int, W: Int, h: Int, w: Int): String {
    return if (h >= H && w <= W) "Yes" else "No"
}