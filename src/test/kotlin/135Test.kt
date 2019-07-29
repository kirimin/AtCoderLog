import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestOf135 {

    @Test
    fun testOf_135_b() {
        assertEquals("YES", abc.problem135b(5, listOf(5, 2, 3, 4, 1)))
        assertEquals("NO", abc.problem135b(5, listOf(2, 4, 3, 5, 1)))
        assertEquals("YES", abc.problem135b(7, listOf(1, 2, 3, 4, 5, 6, 7)))
    }

    @ParameterizedTest
    @CsvSource(
        "2, '3 5 2', '4 5', 9",
        "3, '5 6 3 8', '5 100 8', 22",
        "2, '100 1 1', '1 100', 3"
    )
    fun testOf_135_c(n: Long, a: String, b: String, expect: Long) {
        assertEquals(expect, abc.problem135c(a.split(" ").map { it.toLong() }, b.split(" ").map { it.toLong() }))
    }
}