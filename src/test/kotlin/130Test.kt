import abc.problem130b
import abc.problem131b
import abc.problem137b
import abc.problem137c
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import utilities.countMap
import utilities.toLongList

class TestOf130 {

    @ParameterizedTest
    @CsvSource(
        "3,6,3 4 5,2",
        "4,9,3 3 3 3,4",
        "1,1,1,2",
        "1,1,10,1"
    )
    fun testOf_130_b(n: Long, x: Long, l: String, expected: Int) {
        countMap = mutableMapOf()
        assertEquals(expected, (problem130b(n, x, toLongList(l))))
    }
}

// 0 3 4 5
// 0 1 2 3
// 0 ->
// (1 - 1) + 1 = 1 ->
// (4 - 1) + 4 = 7 ->
// (8 - 1) + 5 = 12