import utilities.debugLog
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()

    if (a + b <= c * 2) {
        println(a * x + b * y)
        return
    }
    val min = Math.min(x, y)
    var value = min * c * 2
    val diff = Math.abs(x - y)
    if (x > y) {
        value += Math.min(diff * a, diff * c * 2)
    } else {
        value += Math.min(diff * b, diff * c * 2)
    }
    println(value)
}