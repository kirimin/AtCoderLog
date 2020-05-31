package agc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem003a(s))
}

fun problem003a(s: String): String {
    val sArray = s.toCharArray()
    val nCount = sArray.count { it == 'N' }
    val sCount = sArray.count() { it == 'S' }
    val eCount = sArray.count { it == 'E' }
    val wCount = sArray.count() { it == 'W' }
    val ns = (nCount == 0 && sCount == 0) || (nCount > 0 && sCount > 0)
    val ew = (eCount == 0 && wCount == 0) || (eCount > 0 && wCount > 0)
    return if (ns && ew) "Yes" else "No"
}