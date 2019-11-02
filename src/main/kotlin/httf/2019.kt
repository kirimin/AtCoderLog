package httf

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val b = sc.nextInt()
    val gy = sc.nextInt()
    val gx = sc.nextInt()
    val ryxc = (0 until m).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next()) }
    val byxc = (0 until b).map { sc.next().toInt() to sc.next().toInt() }
    println(httf2019(n, m, b, gy, gx, ryxc, byxc))
}

fun httf2019(
    n: Int,
    m: Int,
    b: Int,
    gy: Int,
    gx: Int,
    ryxc: List<Triple<Int, Int, String>>,
    byxc: List<Pair<Int, Int>>
): String {
    val flags = hashMapOf<Pair<Int, Int>, String>()
    for (y in 0 until n) {
        for (x in 0 until n) {
            if (y == gy && x == gy) continue
            if (y == gy) {
                flags[y to x] = if (gx - x > 0) "R" else "L"
            }
            if (x == gx) {
                flags[y to x] = if (gy - y > 0) "D" else "U"
            }
        }
    }

    val sb = StringBuilder()
    sb.append("${flags.count()}")
    flags.keys.forEach { yx ->
        sb.append("\n${yx.first} ${yx.second} ${flags[yx]}")
    }
    return sb.toString()
}