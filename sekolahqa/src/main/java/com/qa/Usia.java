package com.qa;

import java.util.Scanner;

public class Usia {
	public static void main(String[] args) {
		System.out.println("======== K E L O M P O K - U S I A========");

		System.out.println("==========================================");

		Scanner input = new Scanner(System.in);
		System.out.print("Input Usia : ");
		int usia = input.nextInt();

		String category = new Usia().getCategory(usia);
		switch (category) {
		case "Balita":
			System.out.println("Usia anda : " + usia + ", Anda termasuk kategori Balita dengan range usia 0-5 tahun");
			break;
		case "Kanak-kanak":
			System.out.println("Usia anda : " + usia + ", Anda termasuk kategori Kanak-kanak dengan range usia 6-11 tahun");
			break;
		case "Remaja":
			System.out.println("Usia anda : " + usia + ", Anda termasuk kategori Remaja dengan range usia 12-25 tahun");
			break;
		case "Dewasa":
			System.out.println("Usia anda : " + usia + ", Anda termasuk kategori Dewasa dengan range usia 26-45 tahun");
			break;
		case "Lansia":
			System.out.println("Usia anda : " + usia + ", Anda termasuk kategori Lansia dengan range usia 46-65 tahun");
			break;
		case "Manula":
			System.out.println(
					"Usia anda : " + usia + ", Anda termasuk kategori Manula dengan range usia 66 tahun keatas");
			break;
		default:
			System.out.println("Usia yang anda masukkan salah");
			break;

		}
	}

	private String getCategory(int usia) {
		if (usia >= 0 && usia <= 5)
			return "Balita";
		else if (usia >= 6 && usia <= 11)
			return "Kanak-kanak";
		else if (usia >= 12 && usia <= 25)
			return "Remaja";
		else if (usia >= 26 && usia <= 45)
			return "Dewasa";
		else if (usia >= 46 && usia <= 65)
			return "Lansia";
		else if (usia >= 66)
			return "Manula";
		else
			return "Invalid";
	}
}
