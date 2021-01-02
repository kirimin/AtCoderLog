package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem005b(n, s))
}

fun problem005b(n: Int, s: String): String {
    var ans = ""
    for (i in 0 until n) {
        val si = s[i]
        ans = ans.replace(si.toString(), "")
        ans += si
    }
    return ans
}