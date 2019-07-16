package com.StringsPractice;

import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "Writing into File"; 
  
        
        FileWriter fw=new FileWriter("output.txt"); 
  
        
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        System.out.println("Writing successful"); 
       
        fw.close(); 
	}

}
