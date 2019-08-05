import abc.problem136b
import abc.problem55b
import abc.problem55c
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestOf136 {

    @ParameterizedTest
    @CsvSource(
        "11,9",
        "136,46",
        "100000,90909"
    )
    fun testOf_136_b(n: Long, expected: Int) {
        assertEquals(expected, (problem136b(n)))
    }

}