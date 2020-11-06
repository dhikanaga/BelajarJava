package com.qa;

import java.util.Scanner;

public class nilaiSiswa {
	public static void main(String[] args) {
		int nilai;
		String nama;
		String grade;
		Scanner scan = new Scanner(System.in);

		System.out.print("Nama: ");
		nama = scan.nextLine();
		System.out.print("Nilai: ");
		nilai = scan.nextInt();

		if (nilai >= 90) {
			grade = "A";
		} else if (nilai >= 80) {
			grade = "B+";
		} else if (nilai >= 70) {
			grade = "B";
		} else if (nilai >= 60) {
			grade = "C+";
		} else if (nilai >= 50) {
			grade = "C";
		} else if (nilai >= 40) {
			grade = "D";
		} else {
			grade = "E";
		}

//		if(grade == "C" || grade == "D" || grade == "E") {
//			System.out.println("Maaf "+nama+", anda tidak lulus T.T karena Grade anda "+grade);
//		}else {
//			System.out.println("Selamat "+ nama+", anda lulus!! Dengan Grade: "+grade);
//		}
		if (nilai >= 60 && nilai <= 100) {
			System.out.println("Selamat " + nama + ", anda lulus!! Dengan Grade: " + grade);
		} else if (nilai < 60 && nilai >= 0) {
			System.out.println("Maaf " + nama + ", anda tidak lulus T.T karena Grade anda " + grade);
		} else {
			System.out.println("Maaf " + nama + ", nilai yang anda inputkan salah.");
		}
	}
}
