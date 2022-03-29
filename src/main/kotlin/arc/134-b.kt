package arc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem134b(n, s))
}

fun problem134b(n: Int, s: String): String {
    val ans = s.toCharArray()
    var right = n
    for (i in 0 until n) {
        var min = s[i]
        var minI = right
        for (j in right - 1 downTo i + 1) {
            if (min > s[j]) {
                min = s[j]
                minI = j
                break
            }
        }
        if (min != s[i]) {
            val tmp = ans[i]
            ans[i] = ans[minI]
            ans[minI] = tmp
            right = minI
        }
    }
    return ans.joinToString("")
}