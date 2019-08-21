import abc.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import utilities.toIntList
import utilities.toLongList

class TestOf113 {

    @ParameterizedTest
    @CsvSource(
        "2,3,'1 2 1','32 63 12','000001000002\n000002000001\n000001000001'",
        "2,3,'2 2 2','55 77 99','000002000001\n000002000002\n000002000003'"
    )
    fun testOf_138_c(n: Long, m: Long, p: String, y:String, expected: String) {
        val p2 = toIntList(p)
        val y2 = toLongList(y)
        val list = (0 until m.toInt()).map { City113(it.toLong(), p2[it], y2[it]) }.toMutableList()
        assertEquals(expected, (problem113c(n, m, list)))
    }
}