package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val k = sc.nextInt()
    println(problem229d(s, k))
}

fun problem229d(s: String, k: Int): Int {
    val cnt = IntArray(s.length + 1)
    for (i in 0 until s.length) {
        if (s[i] == '.') cnt[i + 1] = cnt[i] + 1 else cnt[i + 1] = cnt[i]
    }

    var ans = 0
    var r = 0
    for (l in 0 until s.length) {
        while (r < s.length && cnt[r + 1] - cnt[l] <= k){
            r += 1
        }
        ans = Math.max(ans, r - l)
    }
    return ans
}
