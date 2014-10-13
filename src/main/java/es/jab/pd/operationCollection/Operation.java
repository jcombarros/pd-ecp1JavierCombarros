package es.jab.pd.operationCollection;

public abstract class Operation {
	
	private int operator1;
	private int operator2;
	
	public Operation(){
		this.operator1 = 1;
		this.operator2 = 1;
	}
	
	public Operation(int operator1, int operator2){
		this.operator1 = operator1;
		this.operator2 = operator2;
	}
	
	public int getOperator1(){
		return this.operator1;
	}
	
	public int getOperator2(){
		return this.operator2;
	}
	
	public boolean equals(Object obj){
		return this.getOperator1() == ((Operation)obj).getOperator1()
				&& this.getOperator2() == ((Operation)obj).getOperator2()
				&& this.getClass().equals(obj.getClass());
				
	}
	
	public abstract int operate();
	
	public abstract String toString();
}

