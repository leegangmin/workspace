package jul02;

import java.net.InetAddress;
import java.util.Arrays;

//InetAddress
public class Net03 {
	public static void main(String[] args) {
		
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.clien.com");
			System.out.println("getHostName : " + ip.getHostName());
			System.out.println("getHostAddr : " + ip.getHostAddress());
			System.out.println("문자열로 : " + ip.toString());
			
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress : " + Arrays.toString(ipAddr));
			
			String result = "";
			for (int i = 0; i < ipAddr.length; i++) {
				if (ipAddr[i] < 0) {
					result += ipAddr[i] + 256;
				} else {
					result += ipAddr[i];
				
				}
				result += ".";
				//위나 아래 같음
				result += ( ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i]);
				result += ".";
			}
			System.out.println("변경된 IP : " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//내 ip찍기
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName : " + ip.getHostName());
			System.out.println("getHostAddr : " + ip.getHostAddress());
			System.out.println("문자열로 : " + ip.toString());

			ipArr = InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
