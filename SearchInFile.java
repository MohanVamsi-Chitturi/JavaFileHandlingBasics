package com.StringsPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SearchInFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File fi = new File("D:\\Practice\\StringsPractice\\TextFiles\\FileInput.txt");
		  
		BufferedReader br = new BufferedReader(new FileReader(fi));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Search");
		String cmpStr = sc.nextLine(); 
		String st1=br.readLine();
		
		if(st1.contains(cmpStr))
			System.out.println("String found");
		else
			System.out.println("String not found");
		
	}

}
