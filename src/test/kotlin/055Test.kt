import abc.problem55b
import abc.problem55c
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestOf055 {

    @ParameterizedTest
    @CsvSource(
        "3,6",
        "10,3628800",
        "100000,457992974"
    )
    fun testOf_055_b(n: Long, expected: Long) {
        assertEquals(expected, (problem55b(n)))
    }

    @ParameterizedTest
    @CsvSource(
        "1,6,2",
        "12345,678901,175897"
    )
    fun testOf_055_c(n: Long, m: Long, expected: Long) {
        assertEquals(expected, (problem55c(n, m)))
    }

}