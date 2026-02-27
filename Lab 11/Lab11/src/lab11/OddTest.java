package lab11;
import static org.junit.Assert.*;
import org.junit.Test;
public class OddTest {
    FourFunctions np = new FourFunctions();
    @Test
    public void testIsOdd() {
        assertTrue(np.isOdd(7));
        assertFalse(np.isOdd(10));
    }
}