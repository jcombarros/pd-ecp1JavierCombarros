package es.jab.pd.operationCollection;

public class Summation extends Operation {

	public Summation() {
		super();
	}
	
	public Summation(int operator1, int operator2) {
		super(operator1, operator2);
	}

	@Override
	public int operate() {
		return this.operator1 + this.operator2;
		
	}

	@Override
	public String toString() {
		return "" + this.operator1 + "+" + this.operator2;
	}

}
