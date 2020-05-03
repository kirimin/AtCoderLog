package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

data class ABC165(
    val a: Int,
    val b: Int,
    val c: Int,
    val d: Int
)

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val q = sc.nextInt()
    val abcd = (0 until q).map { ABC165(sc.next().toInt(), sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem165c(n, m, q, abcd))
}

fun problem165c(n: Int, m: Int, q: Int, abcd: List<ABC165>): Long {
    fun aCompute(max: Long, a: List<Int>): Long {
        var sum = 0L
        for (x in 0 until q) {
            if (a[abcd[x].b - 1] - a[abcd[x].a - 1] == abcd[x].c) sum += abcd[x].d
        }
        return kotlin.math.max(max, sum)
    }

    var max = 0L
    for (i1 in 1..m) {
        if (n == 1) {
            max = aCompute(max, listOf(i1))
        } else {
            for (i2 in i1..m) {
                if (n == 2) {
                    max = aCompute(max, listOf(i1, i2))
                } else {
                    for (i3 in i2..m) {
                        if (n == 3) {
                            max = aCompute(max, listOf(i1, i2, i3))
                        } else {
                            for (i4 in i3..m) {
                                if (n == 4) {
                                    max = aCompute(max, listOf(i1, i2, i3, i4))
                                } else {
                                    for (i5 in i4..m) {
                                        if (n == 5) {
                                            max = aCompute(max, listOf(i1, i2, i3, i4, i5))
                                        } else {
                                            for (i6 in i5..m) {
                                                if (n == 6) {
                                                    max = aCompute(max, listOf(i1, i2, i3, i4, i5, i6))
                                                } else {
                                                    for (i7 in i6..m) {
                                                        if (n == 7) {
                                                            max = aCompute(max, listOf(i1, i2, i3, i4, i5, i6, i7))
                                                        } else {
                                                            for (i8 in i7..m) {
                                                                if (n == 8) {
                                                                    max = aCompute(
                                                                        max,
                                                                        listOf(i1, i2, i3, i4, i5, i6, i7, i8)
                                                                    )
                                                                } else {
                                                                    for (i9 in i8..m) {
                                                                        if (n == 9) {
                                                                            max = aCompute(
                                                                                max,
                                                                                listOf(
                                                                                    i1,
                                                                                    i2,
                                                                                    i3,
                                                                                    i4,
                                                                                    i5,
                                                                                    i6,
                                                                                    i7,
                                                                                    i8,
                                                                                    i9
                                                                                )
                                                                            )
                                                                        } else {
                                                                            for (i10 in i9..m) {
                                                                                if (n == 10) {
                                                                                    max = aCompute(
                                                                                        max,
                                                                                        listOf(
                                                                                            i1,
                                                                                            i2,
                                                                                            i3,
                                                                                            i4,
                                                                                            i5,
                                                                                            i6,
                                                                                            i7,
                                                                                            i8,
                                                                                            i9,
                                                                                            i10
                                                                                        )
                                                                                    )
                                                                                } else {
                                                                                    return 0
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
    return max
}

// A = NとMを必ず含む数列　NよりMが小さいことはない
// Aのb - Aのa = cになればdの値を得られる

// A = 1,3,4
// 3 4 3
//1 3 3 100 -> 4 - 1 = 3 OK
//1 2 2 10  -> 3 - 1 = 2 OK
//2 3 2 10  -> 4 - 3 = 1 NG

// 1,1,4
// 1,2,4
// 1,3,4
// 2,3,4
// 3,3,4
// 3,4,4
// 4,4,4