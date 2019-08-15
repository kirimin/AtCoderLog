import abc.problem131b
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestOf131 {

    @ParameterizedTest
    @CsvSource(
        "5,2,18",
        "3,-1,0",
        "30,-50,-1044"
    )
    fun testOf_131_b(n: Long, l: Long, expected: Long) {
        assertEquals(expected, (problem131b(n, l)))
    }
}