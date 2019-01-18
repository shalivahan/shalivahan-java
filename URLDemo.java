package com.url.call;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://github.com/shalivahan/shalivahan-java.git");
			
			System.out.println("Protocol -> "+url.getProtocol());
			System.out.println("Host Name -> "+url.getHost());
			System.out.println("Host Port -> "+url.getPort());
			System.out.println("File Name -> "+url.getFile());
			
			System.out.println("Authority -> "+url.getAuthority());
			System.out.println("Default Port -> "+url.getDefaultPort());
			System.out.println("Path -> "+url.getPath());
			System.out.println("Query -> "+url.getQuery());
			System.out.println("Reference/Anchor -> "+url.getRef());
			System.out.println("User Information -> "+url.getUserInfo());
			
		
		} 
		catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		

	}

}
