package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem307d(n, s))
}

fun problem307d(n: Int, s: String): String {
    var count = 0
    val deque = ArrayDeque<Char>()
    for (i in 0 until n) {
        deque.add(s[i])
        if (s[i] == '(') {
            count++
        } else if (s[i] == ')') {
            if (count > 0) {
                var chr = ' '
                while(chr != '(') {
                    chr = deque.pollLast()
                }
                count--
            }
        }
    }
    return deque.joinToString("")
}