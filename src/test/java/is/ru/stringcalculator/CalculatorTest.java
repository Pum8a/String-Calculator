package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumber() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testInfNumber() {
		assertEquals(15, Calculator.add("1,2,3,4,5"));
	}
	
	@Test
	public void testNewLineNumber() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testNegativeNumber() {
		assertEquals(2, Calculator.add("-1,2"));
	}

	@Test
	public void testMoreNegativeNumber() {
		assertEquals(5, Calculator.add("2,-4,3,-5"));
	}

	@Test
	public void testBigNumbers() {
		assertEquals(2, Calculator.add("1001,2"));
	}

}