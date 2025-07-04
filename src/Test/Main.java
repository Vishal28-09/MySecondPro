package Test;

import InterfaceImpl.CalculatorImpl;
import Interface.Calculator;

public class Main {
	public static void main(String[] args) {
		
		Calculator c = new CalculatorImpl();
		int sum = c.sum(25, 34);
		System.out.println(sum);
		
		int div = c.div(20, 2);
		System.out.println(div);
		
		int sub = c.sub(20, 8);
		System.out.println(sub);
		
		int multi=c.mult(20, 10);
		System.out.println(multi);
		
	}

}
