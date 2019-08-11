import abc.problem56b
import abc.problem56c
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestOf056 {

    @ParameterizedTest
    @CsvSource(
        "3,2,6,1",
        "3,1,3,0",
        "5,10,1,4"
    )
    fun testOf_056_b(w: Long, a: Long, b: Long, expected: Long) {
        assertEquals(expected, (problem56b(w, a, b)))
    }

    @ParameterizedTest
    @CsvSource(
        "6,3",
        "2,2",
        "11,5"
    )
    fun testOf_056_c(x: Long, expected: Long) {
        assertEquals(expected, (problem56c(x)))
    }
}