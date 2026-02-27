package lab11;
import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeTest {
   FourFunctions np = new FourFunctions ();
    @Test
    public void testIsPrime() {
        assertTrue(np.isPrime(13));
        assertFalse(np.isPrime(4));
    }
}