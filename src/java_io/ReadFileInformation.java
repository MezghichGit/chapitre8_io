package java_io;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Reader;

public class ReadFileInformation {
	public static void main(String[] args) throws IOException {

		// File file = new File("C:\\data\\zoo.txt");
		
		  File file = new File("C:\\data"); 
		  System.out.println("File Exists: " +file.exists());
		  
		  if (file.exists()) { 
			  System.out.println("Absolute Path: " +file.getAbsolutePath()); 
			  
			  System.out.println("Is Directory: " +file.isDirectory());
			  
			  System.out.println("Parent Path: " + file.getParent());
		 
		     if (file.isFile()) 
		     { 
		    	 System.out.println("File size: " + file.length());
		         System.out.println("File LastModified: " + file.lastModified());
		  
		     } else 
		     { System.out.println("subfile : "); 
		    	 for (File subfile : file.listFiles()) 
		    	 { 
		    		 
		    		 System.out.println("\t" + subfile.getName()); 
		    		 } 
		    	 } 
		     }
		 

		//new ObjectInputStream(new BufferedInputStream(new FileInputStream("zoo-data.txt"))); 
		//new BufferedWriter(new FileWriter("zoo-data.txt"));
		 
		/* 
		try (Reader rd = new FileReader("C:\\data\\data.txt"))

		{
			System.out.println("Reader");
			System.out.println((char)rd.read());
			System.out.println("End");
		}*/
		
		/*
		try (InputStream is = new BufferedInputStream(new FileInputStream("C:\\data\\data.txt"))) {
			//AB[Mark]CDEF
			System.out.print((char) is.read());
			System.out.print((char) is.read());
			is.mark(100); 
			System.out.print((char)is.read());
			System.out.print((char)is.read()); 
			is.reset();
			System.out.print((char)is.read());
			  //if(is.markSupported()) { 
				//  System.out.println(is.markSupported());
			  //}
			  
			 
		}*/
		// System.out.print((char)is.read());
		// System.out.print((char)is.read());
		// System.out.print((char)is.read());

		/*
		  try(InputStream is = new FileInputStream("C:\\data\\animals.txt")) //TIGERS 
		  {
			  System.out.print ((char)is.read()); //T
			  is.skip(2); // SKIP IG
			  is.read();  // E
			  System.out.print((char)is.read()); // R
			  System.out.print((char)is.read()); //S
		  }*/
		 
	}
}