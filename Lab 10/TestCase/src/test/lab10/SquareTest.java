package test.lab10;
import org.junit.Test;
import static org.junit.Assert.*;
public class SquareTest {
	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.square(5);
		assertEquals(25, output);
	}
}

