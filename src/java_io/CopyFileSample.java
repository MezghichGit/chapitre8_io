package java_io;

import java.io.*;

public class CopyFileSample {
	public static void copy(File source, File destination) throws IOException  {
		try (
				InputStream in = new FileInputStream(source); 
				OutputStream out = new FileOutputStream(destination)) 
		{
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("C:\\data\\nexus.txt");
		
		File destination = new File("C:\\data\\nexus");
		destination.mkdirs();
		
		File destinationFile = new File(destination,"copyNexus.txt");
		copy(source, destinationFile);
		System.out.println("Fin du programme...");
	}
}