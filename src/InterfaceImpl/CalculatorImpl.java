package InterfaceImpl;

import Interface.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int sub(int a, int b) {
		int sub = a-b;
		return sub;
	}

	

	
}
