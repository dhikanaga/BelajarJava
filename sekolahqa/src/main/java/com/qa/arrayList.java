package com.qa;

import java.util.*;

public class arrayList {

	public static void main(String[] args) {
		String[][] name = { { "Citra", "Larasati" }, { "Nino", "Yudha" } };
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.println("Baris ke-" + i + " Kolom ke-" + j + " Terisi " + name[i][j]);
			}
		}
	}
}
