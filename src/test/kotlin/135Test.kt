import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestOf135 {

    @Test
    fun testOf_135_b() {
        assertEquals("YES", abc.problem135b(5, listOf(5, 2, 3, 4, 1)))
        assertEquals("NO", abc.problem135b(5, listOf(2, 4, 3, 5, 1)))
        assertEquals("YES", abc.problem135b(7, listOf(1, 2, 3, 4, 5, 6, 7)))
    }

    @Test
    fun testOf_135_c() {
        assertEquals(9, abc.problem135c(listOf(3, 5, 2), listOf(4, 5)))
        assertEquals(22, abc.problem135c(listOf(5, 6, 3, 8), listOf(5, 100, 8)))
        assertEquals(101, abc.problem135c(listOf(1, 100, 1), listOf(1, 100)))
        assertEquals(101, abc.problem135c(listOf(1, 1, 100), listOf(1, 100)))
        assertEquals(3, abc.problem135c(listOf(1, 1, 100), listOf(100, 1)))
    }
}