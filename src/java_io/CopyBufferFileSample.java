package java_io;

import java.io.*;

public class CopyBufferFileSample {
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new BufferedInputStream(new FileInputStream(source));
				OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
			
			byte[] buffer = new byte[512];
			int lengthRead;
			
			while ((lengthRead = in.read(buffer)) > 0) {
				System.out.println(lengthRead);
				out.write(buffer, 0, lengthRead);
				out.flush();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		File source = new File("C:\\data\\lorem.txt");
		File destination = new File("C:\\data\\copyLorem.txt");
		copy(source, destination);
	}
}