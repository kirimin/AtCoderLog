import abc.problem131b
import abc.problem137b
import abc.problem137c
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
class TestOf137 {

    @ParameterizedTest
    @CsvSource(
        "3,7, '5 6 7 8 9'",
        "4,0, '-3 -2 -1 0 1 2 3'",
        "1,100, '100'"
    )
    fun testOf_137_b(k: Long, x: Long, expected: String) {
        assertEquals(expected, (problem137b(k, x)))
    }

    @ParameterizedTest
    @CsvSource(
        "3,'acornistnt peanutbomb constraint',1",
        "2,'oneplustwo ninemodsix',0",
        "5,'abaaaaaaaa oneplustwo aaaaaaaaba twoplusone aaaabaaaaa',4"
    )
    fun testOf_137_c(n: Long, s:String, expected: Long) {
        assertEquals(expected, (problem137c(n, s.split(" "))))
    }
}