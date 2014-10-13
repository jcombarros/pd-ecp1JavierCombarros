package es.jab.pd.operationCollection;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class OperationHandlerTest {
	
	private OperationHandler operationHandler;
	
	@Before
	public void before() {
		operationHandler = new OperationHandler();
		operationHandler.add(new Summation (2, 3));
	}

	@Test
	public void testAdd() {
		Operation operation = new Subtraction(3, 4);
		operationHandler.add(operation);
		assertEquals(operation, operationHandler.getOperations().get(1));
	}

	@Test
	public void testReset() {
		Operation operation = new Subtraction(3, 4);
		operationHandler.add(operation);
		operationHandler.reset();
		assertEquals(true, operationHandler.getOperations().isEmpty());	
	}

	@Test
	public void testTotal() {
		Operation subtraction = new Subtraction(4, 3);
		Operation summation = new Summation(6, 5);
		operationHandler.add(subtraction);
		operationHandler.add(summation);
		assertEquals(17, operationHandler.total());
	}

}
