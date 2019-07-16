package com.StringsPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fi = new File("D:\\Practice\\StringsPractice\\TextFiles\\FileInput.txt");
		  
		BufferedReader br = new BufferedReader(new FileReader(fi)); 		  
		String st; 
		while ((st = br.readLine()) != null) 
			System.out.println(st); 
		System.out.println("Reading from file completed");
		
		System.out.println("Writing into a File");
		String str; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text to write into a file");
		str=sc.nextLine();
        FileWriter fw=new FileWriter("D:\\Practice\\StringsPractice\\TextFiles\\FileOutput.txt"); 
  
        
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        System.out.println("Writing successful"); 
       
        fw.close();
	}

}
