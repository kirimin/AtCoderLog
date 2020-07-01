import utilities.MathSample
import utilities.debugLog

fun main() {
    val list = listOf(10, 20, 25, 25, 25, 30, 40, 50)
    debugLog(list.binarySearch(25))
}