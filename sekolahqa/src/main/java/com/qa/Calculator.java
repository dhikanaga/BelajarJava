package com.qa;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		System.out.println("========Simple Calculator by Andhika========");
		
		System.out.println("============================================");
	
	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan angka pertama: ");
	double value1 = input.nextDouble();
	System.out.print("Masukkan operasi (+,-,/,*,%): ");
		String operator = input.next();
	System.out.print("Masukkan angka kedua: ");
	double value2 = input.nextDouble();
	
		try {
			double result = new Calculator().getResult(value1, value2, operator);
			DecimalFormat decimalFormat = new DecimalFormat("#.##");
				String formattedResult = decimalFormat.format(result);
				
			System.out.println("Hasilnya dari "+value1+" "+operator+" "+value2+" adalah= "+formattedResult);
		}catch(IllegalArgumentException e) {
			System.out.println("Operasinya ga sesuai!!");
		}
	}
	
		private double getResult(double value1, double value2, String operator) {
			switch(operator) {
			case"+":
				return value1+value2;
			case"-":
				return value1-value2;
			case"*":
				return value1*value2;
			case"/":
				return value1/value2;
			case"%":
				return value1%value2;
			default:
			throw new IllegalArgumentException();
			}
		
	}
}
