package es.jab.pd.operationCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SummationTest {

	
	private Operation summation;

	@Before
	public void before(){
		summation = new Addition(3, 2);
	}

	@Test
	public void testOperate() {
		assertEquals(5, summation.operate());
	}

	@Test
	public void testToString() {
		assertEquals("3+2", summation.toString());
	}
	
	@Test
	public void testEquals() {
		Operation subtraction = new Subtraction(3, 2);
		assertEquals(false, summation.equals(subtraction));
	}

}
