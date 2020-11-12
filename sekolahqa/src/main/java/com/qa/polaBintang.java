package com.qa;

public class polaBintang {

	public static void main(String args[]) {
		int i, j, row = 6;
		System.out.println("Soal nomor 1");

		for (i = 0; i < row; i++) {
			for (j = 2 * (row - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("Soal nomor 2");

		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Soal nomor 3");
		for (i=row;i>=0;i--) {
			for (j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Soal nomor 4");

		for (i = row; i > 0; i--) {
			for (j = 2 * (row - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
