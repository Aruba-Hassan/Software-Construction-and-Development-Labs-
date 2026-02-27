package test.lab10;
import org.junit.Test;
import static org.junit.Assert.*;
public class CountATest {
	@Test
	public void testCountA() {
		JUnitTesting obj = new JUnitTesting();
		int output = obj.countA("Apple");
		assertEquals(1,output);
	}
}
