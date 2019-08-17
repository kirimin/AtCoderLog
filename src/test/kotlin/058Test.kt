import abc.problem058b
import abc.problem058c
import abc.problem56b
import abc.problem56c
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import utilities.debugLog

class TestOf058 {

    @ParameterizedTest
    @CsvSource(
        "xyz,abc,xaybzc",
        "atcoderbeginnercontest,atcoderregularcontest,aattccooddeerrbreeggiunlnaerrccoonntteesstt"
    )
    fun testOf_058_b(o: String, e: String, expected: String) {
        assertEquals(expected, (problem058b(o, e)))
    }

    @ParameterizedTest
    @CsvSource(
        "3,'cbaa daacc acacac','aac'",
        "3,'a aa b',''"
    )
    fun testOf_058_c(n: Long, s: String, expected: String) {
        assertEquals(expected, (problem058c(n, s.split(" "))))
    }
}