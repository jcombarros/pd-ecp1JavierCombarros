package es.jab.pd.operationCollection;

import java.util.ArrayList;
import java.util.List;

public class OperationHandler {
	
	private List<Operation> operations;
	
	public OperationHandler(){
		this.operations = new ArrayList<Operation>();
	}
	
	public List<Operation> getOperations(){
		return this.operations;
	}
	
	public void add(Operation operation){
		this.operations.add(operation);
	}
	
	public void reset(){
		this.operations.clear();
	}
	
	public int total(){
		int result = 0;
		String separator = "";
		for(Operation operation : this.operations){
			System.out.print(separator + "[" + operation.toString() + "]");
			result += operation.operate();
			separator = "+";
		}
		return result;
	}

}
