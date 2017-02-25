package ch05;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		try(FileInputStream input = new FileInputStream("temp.dat")) {
			int value;
			while((value = input.read()) != -1) {
				System.out.println(value);
			}
		}
	}

}
