package Test;

import InterfaceImpl.CalculatorImpl;
import Interface.Calculator;

public class Main {
	public static void main(String[] args) {
		Calculator c = new CalculatorImpl();
		int add = c.add(12,12);
		System.out.println(add);
		
		
		
	}

	
	}


