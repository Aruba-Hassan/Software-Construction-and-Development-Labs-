package lab11;
import static org.junit.Assert.*;
import org.junit.Test;
public class FactorialTest {
	FourFunctions np = new FourFunctions();
    @Test
    public void testFactorial() {
        assertEquals(120, np.calculateFactorial(5));
        assertEquals(1, np.calculateFactorial(0));
    }
}