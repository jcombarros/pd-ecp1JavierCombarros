package es.jab.pd.operationCollection;

public class Addition extends Operation {

	public Addition() {
		super();
	}
	
	public Addition(int operator1, int operator2) {
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
