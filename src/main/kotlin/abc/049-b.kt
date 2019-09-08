package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { sc.next() }
    println(problem049b(h, w, a))
}

fun problem049b(h: Int, w: Int, a: List<String>): String {
    var ans = ""
    for (i in 0 until h) {
        ans += a[i] + "\n" + a[i] + "\n"
    }
    return ans
}