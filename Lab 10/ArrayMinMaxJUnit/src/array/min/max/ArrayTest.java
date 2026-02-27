package array.min.max;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    ArrayMinMax array = new ArrayMinMax();

    @Test
    void testFindMax() {
        int[] arr = {5, 2, 9, 1, 7};
        assertEquals(9, array.findMax(arr));
    }

    @Test
    void testFindMin() {
        int[] arr = {5, 2, 9, 1, 7};
        assertEquals(1, array.findMin(arr));
    }
}
