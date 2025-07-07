package Test;


import InterfaceImpl.CalculatorImpl;

import java.util.Scanner;

import Interface.Calculator;

public class Main {
	public static void main(String[] args) {
		Calculator c = new CalculatorImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number");
		int a = sc.nextInt();
		
		System.out.println("Enter a operation ");
		String operation = sc.next();
		
		System.out.println("Enter a  second number");
		int b =sc.nextInt();
		
		switch(operation) {
		
		case "+" :  
			int addi=c.add(a,b);
		    System.out.println("Addition is : "+addi);
	        break;
	        
		case "-":
			int subs=c.sub(a,b);
		    System.out.println("Subtraction is : "+subs);
	        break;
	        
		case "*": 
			int multi = c.multi(a, b);
		    System.out.println("multiplication is :"+multi);
		    break;
		    
		case "/":
			int divs = c.div(a, b);
		    System.out.println("Divition is : "+divs);
	        break;
	        
	    default: System.out.println("Enter the Right operation ");
		}
		
		
	}

	
}
