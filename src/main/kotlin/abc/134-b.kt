package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()

    val capacity = d * 2 + 1
    var ans = n / capacity
    if (n % capacity != 0) {
        ans++
    }
    println(ans)
}
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14
// d d d 1 d d d|d d d  2  d  d  d