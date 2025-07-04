package Test;

import InterfaceImpl.CalculatorImpl;
import Interface.Calculator;

public class Main {
	public static void main(String[] args) {
		
		Calculator c = new CalculatorImpl();
		int sum = c.sum(12, 34);
		System.out.println(sum);
		
		int div = c.div(10, 2);
		System.out.println(div);
		
	}

}
