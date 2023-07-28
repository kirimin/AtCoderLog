package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem283d(s))
}

fun problem283d(s: String): String {
    val stk = Stack<Char>()
    val box = mutableSetOf<Char>()

    for(i in s) {
        if(i == '(') {
            stk.add(i)
            continue
        }
        if(i == ')') {
            debugLog(stk, box)
            while (stk.isNotEmpty() && stk.peek() != '(') {
                box.remove(stk.pop())
            }
            if(stk.peek() == '(') {
                stk.pop()
            }
        } else if(i in box) {
            return "No"
        }
        box.add(i)
        stk.add(i)
    }
    return "Yes"
}