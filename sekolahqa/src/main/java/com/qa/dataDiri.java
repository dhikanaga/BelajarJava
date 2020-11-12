package com.qa;

import java.util.*;

public class dataDiri {
	public static void main(String[] args) {
		List dataDiri = new ArrayList<Data>();

		Data data = new Data();

		Scanner scan = new Scanner(System.in);
		System.out.print("Input Nama : ");
		data.nama = scan.next();

		System.out.print("Input alamat : ");
		data.alamat = scan.next();

		long noHp;
		do {
			System.out.println("Input nomor HP (10-12 nomor) : ");
			while (!scan.hasNextLong()) {
				System.out.println("Bukan nomor!");
				scan.next(); // this is important!
			}
			noHp = scan.nextLong();
		} while (noHp <= 0);
		int lengthNoHp = String.valueOf(noHp).length() + 1;

		data.noHp = String.format("%0" + lengthNoHp + "d", noHp);

		data.setNoHp(data.noHp);
		System.out.print("Input jenis kelamin (L/P) : ");
		data.jenisKelamin = scan.next();
		data.setJenisKelamin(data.jenisKelamin);

		dataDiri.add(data.nama);
		dataDiri.add(data.alamat);
		dataDiri.add(data.noHp);
		dataDiri.add(data.jenisKelamin);

		// PRINT DATA BY LOOPING
//        for (int i=0; i<diri.size();i++) {
//		for (Object tampil : dataDiri) {
//			System.out.println(tampil.toString());
//		}
		// PRINT DATA MANUAL
		System.out.print("=======D A T A - D I R I=======");
		System.out.print("===============================");
		System.out.println("Nama: " + dataDiri.get(0));
		System.out.println("Alamat: " + dataDiri.get(1));
		System.out.println("Nomor HP: " + dataDiri.get(2));
		System.out.println("Jenis kelamin: " + dataDiri.get(3));
//        }

	}
}
