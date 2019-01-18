package com.url.call;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IP_Address {

	public static void main(String[] args) {
		try {
			InetAddress inetadd = InetAddress.getByName("CasaDigi");
			
			System.out.println("HOST NAME-> "+inetadd.getHostName());
			System.out.println("HOST ADDRESS-> "+inetadd.getHostAddress());
			System.out.println("HOST ADDRESS IN BYTES-> "+new String(inetadd.getAddress(),"UTF-8"));
			System.out.println("CANONICAL HOST ADDRESS-> "+inetadd.getCanonicalHostName());
			System.out.println("HOST FULL ADDRESS-> "+Arrays.toString(InetAddress.getAllByName("localhost")));
			System.out.println("HOST NAME-> "+InetAddress.getLocalHost());
			
		} 
		catch (UnknownHostException | UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}


	}

}
