package com.qa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//    {
//        System.out.println( getMyName());
//    }
//    public static String getMyName(){
//        return "Hello my name is Dhika";
	
	int belanja = 0;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Total Belanjaan: Rp. ");
	belanja = scan.nextInt();
	
	if(belanja > 100000) {
		System.out.println("Selamat, anda mendapatkan hadiah!");
	}
	System.out.println("Terimakasih!");
   }
}

