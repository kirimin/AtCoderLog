package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem111b(n))
}

fun problem111b(n: Int): String {
    val ns = n.toString()
    if (ns[0] == ns[1] && ns[1] == ns[2]) return ns
    if (ns[0] == ns[1] && ns[1] < ns[2]) {
        return if (ns[0] <= ns[2]) "${ns[0] + 1}${ns[0] + 1}${ns[0] + 1}" else {
            "${ns[0]}${ns[0]}${ns[0]}"
        }
    }
    if (ns[0] == ns[1] && ns[1] > ns[2]) {
        return "${ns[0]}${ns[0]}${ns[0]}"
    }
    if (ns[0] < ns[1]) return "${ns[0] + 1}${ns[0] + 1}${ns[0] + 1}"
    if (ns[0] > ns[1]) {
        return "${ns[0]}${ns[0]}${ns[0]}"
    }
    return ""
}