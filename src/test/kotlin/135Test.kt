import org.junit.Assert
import org.junit.Test

class TestOf135 {

    @Test
    fun testOf_135_b() {
        Assert.assertEquals(abc.problem135b(5, listOf(5, 2, 3, 4, 1)), "YES")
        Assert.assertEquals(abc.problem135b(5, listOf(2, 4, 3, 5, 1)), "NO")
        Assert.assertEquals(abc.problem135b(7, listOf(1, 2, 3, 4, 5, 6, 7)), "YES")
    }

    @Test
    fun testOf_135_c() {
        Assert.assertEquals(abc.problem135c(listOf(10, 5, 5), listOf(5, 5)), 10)
        Assert.assertEquals(abc.problem135c(listOf(5, 5), listOf(7)), 7)
        Assert.assertEquals(abc.problem135c(listOf(1, 1), listOf(1)), 1)
        Assert.assertEquals(abc.problem135c(listOf(1, 1), listOf(10)), 2)
        Assert.assertEquals(abc.problem135c(listOf(10, 10), listOf(1)), 1)
        Assert.assertEquals(abc.problem135c(listOf(3, 5, 2), listOf(4, 5)), 9)
        Assert.assertEquals(abc.problem135c(listOf(5, 6, 3, 8), listOf(5, 100, 8)), 22)
        Assert.assertEquals(abc.problem135c(listOf(1, 100, 1), listOf(1, 100)), 101)
        Assert.assertEquals(abc.problem135c(listOf(1, 1, 100), listOf(1, 100)), 101)
        Assert.assertEquals(abc.problem135c(listOf(100, 1, 1), listOf(100, 1)), 101)
        Assert.assertEquals(abc.problem135c(listOf(1, 100, 1), listOf(100, 1)), 101)
        Assert.assertEquals(abc.problem135c(listOf(1, 1, 100), listOf(100, 1)), 3)
        Assert.assertEquals(abc.problem135c(listOf(1, 1, 100), listOf(100, 1)), 3)
        Assert.assertEquals(abc.problem135c(listOf(50, 50, 50), listOf(1, 1)), 2)
        Assert.assertEquals(abc.problem135c(listOf(100, 100, 1), listOf(300, 1)), 201)
        Assert.assertEquals(abc.problem135c(listOf(100, 1, 100), listOf(300, 1)), 102)
        Assert.assertEquals(abc.problem135c(listOf(100, 1, 100), listOf(300, 1)), 102)
        Assert.assertEquals(abc.problem135c(listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1), listOf(1, 1, 1, 1, 1, 1, 1, 1, 1)), 9)
        Assert.assertEquals(abc.problem135c(listOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10), listOf(1, 1, 1, 1, 1, 1, 1, 1, 1)), 9)
    }
}