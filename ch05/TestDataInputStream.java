package ch05;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDataInputStream {

	public static void main(String[] args) throws IOException {
		try {
			try(DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
//			System.out.println(input.readUTF() + " " + input.readDouble());
//			System.out.println(input.readUTF() + " " + input.readDouble());
//			System.out.println(input.readUTF() + " " + input.readDouble());
				while(true) {
					System.out.println(input.readUTF() + " " + input.readDouble());
				}
			}
		} catch (EOFException e) {
			System.out.println("You have reached the end of file.");
		}
	}

}
