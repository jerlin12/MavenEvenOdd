import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EvenOddTest {
    @Test
    public void testEven() {
        assertEquals("Odd", EvenOdd.check(10));
    }
}
