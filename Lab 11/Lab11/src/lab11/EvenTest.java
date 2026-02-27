package lab11;
import static org.junit.Assert.*;
import org.junit.Test;
public class EvenTest {
    FourFunctions np = new FourFunctions();
    public void testIsEven() {
        assertTrue(np.isEven(10));
        assertFalse(np.isEven(7));
    }
}