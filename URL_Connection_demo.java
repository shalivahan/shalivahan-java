/* 
 *The Java URLConnection class represents a communication
 * link between the URL and the application.
 *  This class can be used to read and write data
 *   to the specified resource referred by the URL. 
 */
package com.url.call;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URL_Connection_demo {

	// Displaying source code of a webpage by URLConnecton class
	public static void main(String[] args) {

		URL url;
		try {
			url = new URL("https://github.com/shalivahan/shalivahan-java.git");
			URLConnection urlconn = url.openConnection();
			InputStream input = urlconn.getInputStream();

			while (input.read() != -1) {
				System.out.print((char) input.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
