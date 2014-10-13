package es.jab.pd.operationCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubtractionTest {
	
	private Operation subtraction;
	private Operation subtraction2;

	@Before
	public void before(){
		subtraction = new Subtraction(6, 2);
		subtraction2 = new Subtraction(3, 7);
	}

	@Test
	public void testOperate() {
		assertEquals(4, subtraction.operate());
	}
	
	@Test
	public void testOperate2() {
		assertEquals(-4, subtraction2.operate());
	}

	@Test
	public void testToString() {
		assertEquals("6-2", subtraction.toString());
	}
	
	@Test
	public void testEquals() {
		Operation summation = new Addition(3, 2);
		assertEquals(false, subtraction.equals(summation));
	}

}
