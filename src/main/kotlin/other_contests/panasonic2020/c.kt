package other_contests.panasonic2020

import java.math.BigDecimal
import java.math.MathContext
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    println(problempanasonic2020c(a, b, c))
}

fun problempanasonic2020c(a: Long, b: Long, c: Long): String {
    fun sqrt(a: BigDecimal, scale: Int): BigDecimal? {
        var x = BigDecimal(Math.sqrt(a.toDouble()), MathContext.DECIMAL64)
        if (scale < 17) {
            x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN)
            return x
        }
        val b2 = BigDecimal(2)
        var tempScale = 16
        while (tempScale < scale) {
            x = x.subtract(
                x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN
                )
            )
            tempScale *= 2
        }
        return x
    }
    return if (sqrt(BigDecimal(a), 18)!!.add(sqrt(BigDecimal(b), 18)) < sqrt(BigDecimal(c), 18)) "Yes" else "No"
}