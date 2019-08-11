package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next().toLong()
    println(problem56c(x))
}

fun problem56c(x: Long): Long {
    var time = 0L
    var currentX = 0L
    while(currentX < x) {
        time++
        currentX += time
    }
    return time
}

// [0] 1 2 3 4 5 "6" 7 8 9 10
// 0,1 -> 0 + 1 = 1
// 1,2 -> 1 + 2 = 3
// 3,3 -> 3 + 3 = 6