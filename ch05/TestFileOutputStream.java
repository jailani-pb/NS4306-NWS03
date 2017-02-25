package ch05;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		try(FileOutputStream output = new FileOutputStream("temp.dat")) {
			for(int i = 1; i <= 10; i++) {
				output.write(i);
			}
		}
	}

}
