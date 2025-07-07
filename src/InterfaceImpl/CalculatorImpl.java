package InterfaceImpl;

import Interface.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int sub(int a, int b) {
		int sub = a-b;
		return sub;
	}

	@Override
	public int add(int a, int b) {
		int add= a+b;
		return add;
	}

	@Override
	public int multi(int a, int b) {
		int multi = a*b;
	    return multi;
	}

	@Override
	public int div(int a, int b) {
		int div = a/b;
		return div;
	}

	

	
}
