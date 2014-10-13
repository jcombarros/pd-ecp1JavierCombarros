package es.jab.pd.operationCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {

	private Operation multiplication;

	@Before
	public void before(){
		multiplication = new Multiplication(3, 5);
	}

	@Test
	public void testOperate() {
		assertEquals(15, multiplication.operate());
	}

	@Test
	public void testToString() {
		assertEquals("5*3", multiplication.toString());
	}
	
	@Test
	public void testEquals() {
		Operation multiplication2 = new Multiplication(3, 5);
		assertEquals(true, multiplication.equals(multiplication2));
	}
	
	@Test
	public void testEquals2() {
		Operation multiplication2 = new Multiplication(3, 9);
		assertEquals(false, multiplication.equals(multiplication2));
	}

}
