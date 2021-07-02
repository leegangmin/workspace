package jul02;

import java.net.URL;
import java.net.URLConnection;

public class Net04 {

	public static void main(String[] args) {
		//URL url = null;
		
		try {
			/*url = new URL("https://www.clien.net/service/board/news/16281434?od=T31&po=0&category=0&groupCd");
			URLConnection conn = url.openConnection();
			System.out.println("conn : " + conn);
			System.out.println("getAllowUserInteraction : " + conn.getAllowUserInteraction());
			System.out.println("getConnetTimeOut() : " + conn.getConnectTimeout());
			System.out.println("getContent : " + conn.getContent());
			System.out.println("getContentEncoding : " + conn.getContentEncoding());
			System.out.println("getDate() : " + conn.getDate());
			System.out.println("getDefaultUserCaches : " + conn.getDefaultUseCaches());
			System.out.println("getContentType : " + conn.getContentType());
			System.out.println("getDoInput() : " + conn.getDoInput());
			System.out.println("getExpiration : " + conn.getExpiration());
			System.out.println("getHeaderField : " + conn.getHeaderFields());
			System.out.println("getIfModifiedSince : " + conn.getIfModifiedSince());
			System.out.println("getLastModified : " + conn.getLastModified());
			System.out.println("getUrl : " + conn.getURL());
			System.out.println("getUserCache : " + conn.getUseCaches());
			*/
			
			URL url = new URL("https://www.clien.net/service/board/news/16281434?od=T31&po=0&category=0&groupCd");
			System.out.println("urlgetAuthority : " + url.getAuthority());
			System.out.println("getContent : " + url.getContent());
			System.out.println("getDefaultPort : " + url.getDefaultPort());
			System.out.println("getFile() : " + url.getFile());
			System.out.println("getHost : " + url.getHost());
			System.out.println("getPath : " + url.getPath());
			System.out.println("getProtocol : " + url.getProtocol());
			System.out.println("getQuery : " + url.getQuery());
			System.out.println("getRef : " + url.getRef());
			System.out.println("getUserInfo : " + url.getUserInfo());
			System.out.println("toExternalForm : " + url.toExternalForm());
			System.out.println("toURI : " + url.toURI());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
