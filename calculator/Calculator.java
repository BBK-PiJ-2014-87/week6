package calculator;

import java.util.Scanner;

public class Calculator {
	
	public int inputNum1(){
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		return num1;
	}
	
	public int inputNum2(){
		Scanner in = new Scanner(System.in);
		int num2 = in.nextInt();
		return num2;
	}
	
	
	public int add(int num1, int num2){
		return (num1+num2);
	}
	
	public int subtract(int num1, int num2){
		return (num1 - num2);		
	}
	
	public int multiply(int num1, int num2){
		return(num1 * num2);
	}
	
	public double divide(double num1, double num2){		
		return (num1/num2);
	}
	
	public int modulus(int num1, int num2){
		return (num1%num2);
	}
	
	

}
