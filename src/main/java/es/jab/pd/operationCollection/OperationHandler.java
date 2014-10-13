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
		
	}
	
	public void reset(){
		
	}
	
	public int total(){
		return 0;
	}

}
