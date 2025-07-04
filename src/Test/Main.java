package Test;


import InterfaceImpl.CalculatorImpl;
import Interface.Calculator;

public class Main {
	public static void main(String[] args) {
		Calculator c = new CalculatorImpl();
		
		int subs=c.sub(12,32);
		System.out.println(subs);
		
		
	}

}
