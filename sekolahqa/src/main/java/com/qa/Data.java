package com.qa;

import java.util.Scanner;

public class Data {
	public String nama;
	public String alamat;
	public String noHp;
	public String jenisKelamin;

	public Data() {

	}

	public Data(String nama, String alamat, String noHp, String jenisKelamin) {
		this.nama = nama;
		this.alamat = alamat;
		this.noHp = noHp;
		this.jenisKelamin = jenisKelamin;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoHp() {
		return noHp;
	}

	public String setNoHp(String noHp) {
		int lenght = this.noHp.length();
		if (lenght >= 10 && lenght <= 12) {
			this.noHp = noHp;
		} else {
			this.noHp = "Tidak Valid! No hp yang anda input adalah " + lenght + " karakter";
		}
		return noHp;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public String setJenisKelamin(String jenisKelamin) {

		if (this.jenisKelamin.equalsIgnoreCase("L")) {
			this.jenisKelamin = "Laki-laki";
		} else if (this.jenisKelamin.equalsIgnoreCase("P")) {
			this.jenisKelamin = "Perempuan";
		} else {
			this.jenisKelamin = "Jenis kelamin anda salah";
		}
		return jenisKelamin;
	}

}
