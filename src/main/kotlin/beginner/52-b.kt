package beginner

import java.lang.IllegalArgumentException
import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val length = sc.nextInt()
    val s = sc.next()

    var x = 0
    var answer = x

    s.forEach {
        answer = Math.max(x, answer)
        when (it) {
            'I' -> x++
            'D' -> x--
            else -> throw IllegalArgumentException("wrong args")
        }
        answer = Math.max(x, answer)
    }
    println(answer)
}