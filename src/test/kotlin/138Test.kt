import abc.problem137b
import abc.problem137c
import abc.problem138b
import abc.problem138c
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import utilities.toIntList
import utilities.toLongList

class TestOf138 {

    @ParameterizedTest
    @CsvSource(
        "2,10 30,7.5",
        "3,200 200 200,66.66666666666667"
    )
    fun testOf_138_b(n: Long, a: String, expected: Double) {
        assertEquals(expected, (problem138b(n, toLongList(a))))
    }

    // 3 + 2 / 60 = 5 / 60 = 12

    @ParameterizedTest
    @CsvSource(
        "2,3 4,3.5",
        "3,500 300 200,375",
        "5,138 138 138 138 138,138"
    )
    fun testOf_138_c(n: Int, v:String, expected: Double) {
        assertEquals(expected, (problem138c(n, toIntList(v))))
    }
}
