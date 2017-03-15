package ch06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class MultipleClientServer {
	
	static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		try {
			serverSocket = new ServerSocket(9102);
			System.out.println("Server started " + new Date() + "\n");
			
			while(true) {
				Socket socket = serverSocket.accept();

				new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							// Create data output and input streams
							DataOutputStream toClient = new DataOutputStream(
									new BufferedOutputStream(socket.getOutputStream()));
							DataInputStream fromClient = new DataInputStream(
									new BufferedInputStream(socket.getInputStream()));
							
							while(true) {
								// Receive radius from client
								double radius = fromClient.readDouble();
								// Calculate the area
								double area = radius * radius * Math.PI;
								// Send the area to client and flush the buffered stream
								toClient.writeDouble(area);
								toClient.flush();
								
								System.out.println("Radius received: " + radius);
								System.out.println("Calculated area: " + area);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
