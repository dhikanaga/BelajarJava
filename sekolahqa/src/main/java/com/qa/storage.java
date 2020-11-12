package com.qa;
import java.util.*;
public class storage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Object> item = new LinkedHashMap<>();
		String isInput = "Y";
		
		System.out.println("Simple data input program");
		
		while (isInput.equals("Y")) {
			System.out.print("Apakah mau input data barang? (Y/N): ");
			isInput = input.next();
			
			switch (isInput) {
			case "Y":
				new storage().inputData(input,item);
				break;
			case "N":
				new storage().showData(item);
				break;
			default:
				System.out.println("Pilihan anda tidak sesuai!");
			}
		}
		}
	private void inputData(Scanner input, Map <String, Object> item) {
		System.out.print("Nama barang: ");
		input.nextLine();
		String name = input.nextLine();
		
		System.out.print("Jumlah: ");
		int quantity = input.nextInt();
		
		item.put(name, quantity);
	}
	private void showData(Map<String, Object> item) {
		System.out.println("======== D A T A - B A R A N G========");
		System.out.println("======================================");
		
		for (String key : item.keySet()) {
			System.out.println("Nama Barang : " + key + " ,Jumlah : " + item.get(key));
		}
	}
	
}
