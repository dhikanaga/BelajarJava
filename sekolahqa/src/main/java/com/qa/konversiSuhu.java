package com.qa;

import java.util.Scanner;

public class konversiSuhu {
	public static void main(String[] args) {
		System.out.println("======== K O N V E R S I   S U H U   A I R========");

		System.out.println("==================================================");

		Scanner input = new Scanner(System.in);
		System.out.print("Input Suhu air(C) : ");
		int suhu = input.nextInt();

		String category = new konversiSuhu().getCategory(suhu);
		
		System.out.println("Air tersebut " + category);
			
	}

	private String getCategory(int suhu) {
		if (suhu <= 0)
			return "Beku";
		else if (suhu >= 1 && suhu <= 10)
			return "Dingin";
		else if (suhu >= 11 && suhu <= 20)
			return "Sejuk";
		else if (suhu >= 21 && suhu <= 25)
			return "Sedang";
		else if (suhu >= 26 && suhu <= 99)
			return "Panas";
		else if (suhu >= 100)
			return "Mendidih";
		else
			return "Invalid";
	}

}
