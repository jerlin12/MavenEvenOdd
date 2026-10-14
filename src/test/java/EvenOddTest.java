import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EvenOddTest {
    @Test
    public void testEven() {
        assertEquals("Even", EvenOdd.check(10));
    }
}
