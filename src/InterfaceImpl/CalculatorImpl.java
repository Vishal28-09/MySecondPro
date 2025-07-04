package InterfaceImpl;

import Interface.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public int div(int a, int b) {
		 int div = a/b;
		return div;
	}

	@Override
	public int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}

}
