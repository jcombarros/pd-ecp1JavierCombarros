package es.jab.pd.operationCollection;

public class Main {

	public static void main(String[] args) {
		OperationHandler operationHandler = new OperationHandler();
		operationHandler.add(new Addition(3, 4));

        System.out.println("Total1:" + operationHandler.total());
        
        operationHandler.reset();
        operationHandler.add(new Subtraction(1, 1));
        operationHandler.add(new Addition(3, 5));
        operationHandler.add(new Multiplication(1, 2));
        operationHandler.add(new Subtraction(4, 1));
        operationHandler.add(new Addition(3, 6));
        operationHandler.add(new Subtraction(3, 2));
        operationHandler.add(new Multiplication(3, 6));

        System.out.println("Total2:" + operationHandler.total());
	}

}
