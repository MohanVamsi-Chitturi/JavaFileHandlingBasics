package com.StringsPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WordCount {

	public static void main(String[] args) throws Exception  {
		//Scanner sc = new Scanner(System.in);
		//FileReader fr = new FileReader("D:\\Practice\\StringsPractice\\TextFiles\\WordCount.txt");
		int count=0;
		BufferedReader br = new BufferedReader(new FileReader("D:\\Practice\\StringsPractice\\TextFiles\\WordCount.txt")); 		  
		String st; 
		while ((st = br.readLine()) != null) 
			System.out.println(st.split(" ").length); 
	}
}
