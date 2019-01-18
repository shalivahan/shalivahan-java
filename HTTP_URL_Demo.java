package com.url.call;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTP_URL_Demo {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://github.com/shalivahan/shalivahan-java");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();

			for (int i = 0; i < 9; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + "  <--->  " + huc.getHeaderField(i));
			}
			System.out.println("Content Type-> " + huc.getContentType());
			System.out.println("Content Encoding-> " + huc.getContentEncoding());
			System.out.println("Content Length-> " + huc.getContentLengthLong());
			
		}

		catch (IOException e) {

			e.printStackTrace();
		}

	}

}
