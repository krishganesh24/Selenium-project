package Week9_Challenges;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_IPaddress {

	public static void main(String[] args) throws UnknownHostException {

		
		InetAddress ipadd = InetAddress.getLocalHost();
		String ip =ipadd.getHostAddress();
		
		System.out.println(ip);
		
		if (ip.equals("192.168.1.7")) {
			
			System.out.println("Valid Ip address");
		}	
			else {
				System.out.println("invalid Ip address");
			}
			
		}
	}


