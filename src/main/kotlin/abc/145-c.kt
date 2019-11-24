package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toDouble() to sc.next().toDouble() }
    println(problem145c(n, xy))
}

fun problem145c(n: Int, xy: List<Pair<Double, Double>>): Double {
    val distance = fun(i: Int, j: Int) =
        Math.sqrt((Math.pow(xy[i].first - xy[j].first, 2.0) + Math.pow(xy[i].second - xy[j].second, 2.0)))
    val list = mutableListOf<Double>()
    when {
        n == 2 -> {
            for (a in 0 until n) {
                for (b in 0 until n) {
                    if (a == b) continue
                    list.add(distance(a, b))
                }
            }
        }
        n == 3 -> {
            for (a in 0 until n) {
                for (b in 0 until n) {
                    for (c in 0 until n) {
                        if (listOf(a, b, c).distinct().size != 3) continue
                        list.add(distance(a, b) + distance(b, c))
                    }
                }
            }
        }
        n == 4 -> {
            for (a in 0 until n) {
                for (b in 0 until n) {
                    if (a == b) continue
                    for (c in 0 until n) {
                        if (b == c) continue
                        for (d in 0 until n) {
                            if (c == d) continue
                            list.add(distance(a, b) + distance(b, c) + distance(c, d))
                        }
                    }
                }
            }
        }
        n == 5 -> {
            for (a in 0 until n) {
                for (b in 0 until n) {
                    if (a == b) continue
                    for (c in 0 until n) {
                        if (b == c) continue
                        for (d in 0 until n) {
                            if (c == d) continue
                            for (e in 0 until n) {
                                if (d == e) continue
                                list.add(distance(a, b) + distance(b, c) + distance(c, d) + distance(d, e))
                            }
                        }
                    }
                }
            }
        }
        n == 6 -> {
            for (a in 0 until n) {
                for (b in 0 until n) {
                    if (a == b) continue
                    for (c in 0 until n) {
                        if (b == c) continue
                        for (d in 0 until n) {
                            if (c == d) continue
                            for (e in 0 until n) {
                                if (d == e) continue
                                for (f in 0 until n) {
                                    if (e == f) continue
                                    list.add(
                                        distance(a, b) + distance(b, c) + distance(c, d) + distance(
                                            d,
                                            e
                                        ) + distance(e, f)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
        n == 7 -> {
            for (a in 0 until n) {
                for (b in 0 until n) {
                    if (a == b) continue
                    for (c in 0 until n) {
                        if (b == c) continue
                        for (d in 0 until n) {
                            if (c == d) continue
                            for (e in 0 until n) {
                                if (d == e) continue
                                for (f in 0 until n) {
                                    if (e == f) continue
                                    for (g in 0 until n) {
                                        if (f == g) continue
                                        list.add(
                                            distance(a, b) + distance(b, c) + distance(c, d) + distance(
                                                d,
                                                e
                                            ) + distance(e, f) + distance(f, g)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        n == 8 -> {
            for (a in 0 until n) {
                for (b in 0 until n) {
                    if (a == b) continue
                    for (c in 0 until n) {
                        if (b == c) continue
                        for (d in 0 until n) {
                            if (c == d) continue
                            for (e in 0 until n) {
                                if (d == e) continue
                                for (f in 0 until n) {
                                    if (e == f) continue
                                    for (g in 0 until n) {
                                        if (f == g) continue
                                        for (h in 0 until n) {
                                            if (g == h) continue
                                            list.add(
                                                distance(a, b) + distance(b, c) + distance(c, d) + distance(
                                                    d,
                                                    e
                                                ) + distance(e, f) + distance(f, g) + distance(g, h)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return list.average()
}