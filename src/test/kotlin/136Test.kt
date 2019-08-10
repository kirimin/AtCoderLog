import abc.problem136b
import abc.problem136c
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

    @ParameterizedTest
    @CsvSource(
        "5,'1 2 1 1 3', 'Yes'",
        "5,'1 3 1 1 3', 'No'",
        "4,'1 3 2 1', 'No'",
        "5,'1 2 3 4 5', 'Yes'",
        "5,'5 4 3 2 1', 'No'",
        "5,'5 4 4 4 4', 'Yes'",
        "5,'5 5 4 4 4', 'Yes'",
        "5,'5 5 5 4 4', 'Yes'",
        "5,'5 4 4 4 2', 'No'",
        "1,'1000000000', 'Yes'",
        "2,'1 1', 'Yes'",
        "2,'2 1', 'Yes'",
        "2,'1 2', 'Yes'",
        "2,'3 1', 'No'",
        "2,'1 3', 'Yes'",
        "4,'5 4 4 3', 'No'"
    )
    fun testOf_136_c(n: Long, h:String, expected: String) {
        assertEquals(expected, (problem136c(n, h.split(" ").map { it.toLong() })))
    }
}