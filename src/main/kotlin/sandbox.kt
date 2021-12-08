import utilities.debugLog
import java.util.*

fun main() {
    val N = 1048576L
    val a = hashMapOf<Long, Long>()
    val ans = mutableListOf<Long>()

    val samples = longArrayOf(1048537, 1, 2097153)
    for (xi in samples) {
        var h = xi
        debugLog(xi, h, h % N, (a[h % N] ?: -1))
        while ((a[h % N] ?: -1) != -1L) {
            h++
            debugLog(xi, h, h % N, (a[h % N] ?: -1))
        }
        a[h % N] = xi
    }
}