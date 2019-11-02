package httf

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
    val byxc = (0 until b).map { sc.next().toInt() to sc.next().toInt() }.toHashSet()
    println(httf2019(n, m, b, gy, gx, ryxc, byxc))
}

fun httf2019(
    n: Int,
    m: Int,
    b: Int,
    gy: Int,
    gx: Int,
    robot: List<Triple<Int, Int, String>>,
    blocks: HashSet<Pair<Int, Int>>
): String {
    val flags = hashMapOf<Pair<Int, Int>, String>()
    fun directions(y: Int, x: Int): List<Pair<Int, Int>> {
        val up = (if (y == 0) n - 1 else y - 1) to x
        val down = (if (y == n - 1) 0 else y + 1) to x
        val right = y to (if (x == 0) n - 1 else x - 1)
        val left = y to (if (x == n - 1) 0 else x + 1)
        return listOf(up, down, right, left)
    }
    for (y in 0 until n) {
        for (x in 0 until n) {
            if (!blocks.contains(y to x)) continue

            fun xFun() = if (gx > n / 2) {
                if (gx > x && n - gx < x) "R" else "L"
            } else {
                if (gx > x) "R" else "L"
            }

            fun yFun() = if (gy > n / 2) {
                if (gy > y && n - gy < y) "D" else "U"
            } else {
                if (gy > y) "D" else "U"
            }

            val directions = directions(y, x)
            if (!blocks.contains(directions[0])) {
                if (!blocks.contains(y - 1 to x + 1) && !blocks.contains(y - 1 to x - 1)) {
                    flags[directions[0]] = xFun()
                } else {
                    val up = directions(directions[0].first, directions[0].second)
                    when {
                        !blocks.contains(up[2]) -> flags[directions[0]] = "L"
                        !blocks.contains(up[3]) -> flags[directions[0]] = "R"
                        !blocks.contains(up[1]) -> flags[directions[0]] = "U"
                        !blocks.contains(up[0]) -> flags[directions[0]] = "D"
                    }
                }
            }
            if (!blocks.contains(directions[1])) {
                if (!blocks.contains(y + 1 to x + 1) && !blocks.contains(y + 1 to x - 1)) {
                    flags[directions[1]] = xFun()
                } else {
                    val down = directions(directions[1].first, directions[1].second)
                    when {
                        !blocks.contains(down[2]) -> flags[directions[1]] = "L"
                        !blocks.contains(down[3]) -> flags[directions[1]] = "R"
                        !blocks.contains(down[1]) -> flags[directions[1]] = "U"
                        !blocks.contains(down[0]) -> flags[directions[1]] = "D"
                    }
                }
            }
            if (!blocks.contains(directions[2])) {
                if (!blocks.contains(y + 1 to x - 1) && !blocks.contains(y - 1 to x - 1)) {
                    flags[directions[2]] = yFun()
                }
            } else {
                val left = directions(directions[2].first, directions[2].second)
                when {
                    !blocks.contains(left[0]) -> flags[directions[2]] = "U"
                    !blocks.contains(left[1]) -> flags[directions[2]] = "D"
                    !blocks.contains(left[3]) -> flags[directions[2]] = "L"
                    !blocks.contains(left[2]) -> flags[directions[2]] = "R"
                }
            }
            if (!blocks.contains(directions[3])) {
                if (!blocks.contains(y + 1 to x + 1) && !blocks.contains(y - 1 to x + 1)) {
                    flags[directions[3]] = yFun()
                }
            } else {
                val right = directions(directions[3].first, directions[3].second)
                when {
                    !blocks.contains(right[0]) -> flags[directions[3]] = "U"
                    !blocks.contains(right[1]) -> flags[directions[3]] = "D"
                    !blocks.contains(right[3]) -> flags[directions[3]] = "L"
                    !blocks.contains(right[2]) -> flags[directions[3]] = "R"
                }
            }
        }
    }

    val flags2 = flags + hashMapOf()

    for (y in 0 until n) {
        for (x in 0 until n) {
            // go strait to the goal
            if (blocks.contains(y to x)) continue
            if (flags.containsKey(y to x)) continue
            if (y == gy && x == gy) continue
            if (20 < Math.abs(gy - y) + Math.abs(gx - x)) continue
            if (Math.abs(gy - y) < Math.abs(gx - x)) {
                flags[y to x] = if (gx > x) "R" else "L"
            } else {
                flags[y to x] = if (gy > y) "D" else "U"
            }
        }
    }

    for (y in 0 until n) {
        for (x in 0 until n) {
            val flag = flags[y to x] ?: continue
            val directions = directions(y, x)
            when {
                flag == "L" && flags[directions[2]] == "R" -> {
                    flags.remove(y to x)
                    if (blocks.contains(directions[0])) flags[y to x] = "D" else flags[y to x] = "U"
                }
                flag == "R" && flags[directions[3]] == "L" -> {
                    flags.remove(y to x)
                    if (blocks.contains(directions[0])) flags[y to x] = "D" else flags[y to x] = "U"
                }
                flag == "U" && flags[directions[0]] == "D" -> {
                    flags.remove(y to x)
                    if (blocks.contains(directions[2])) flags[y to x] = "L" else flags[y to x] = "R"
                }
                flag == "D" && flags[directions[1]] == "U" -> {
                    flags.remove(y to x)
                    if (blocks.contains(directions[2])) flags[y to x] = "L" else flags[y to x] = "R"
                }
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
