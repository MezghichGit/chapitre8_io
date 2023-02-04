package java_io;

import java.io.File;

public class Part1 {

	public static void main(String[] args) {
		
		//System.out.println(System.getProperty("file.separator"));
		//System.out.println(java.io.File.separator); 
		
		//File file = new File("C:\\Users\\amine\\Desktop\\OCP_11_Octobre_2022\\4-Code_Source\\OCP_2023\\src\\java_io\\Part1.java");
		
		//File file = new File("C:\\data");
		
		File parent = new File("C:\\data");
		File file = new File(parent,"zoo.txt"); 
		//File file = new File("C:\\data\\animals.txt");
		System.out.println("Exist or Not ? : "+file.exists());
		System.out.println("Directory or Not ? : "+file.isDirectory());
		System.out.println("File or Not ? : "+file.isFile());
		


	}

}
