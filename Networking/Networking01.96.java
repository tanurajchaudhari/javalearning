/*
import java.net.*;
import java.io.*;

class IpAddrres{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String site=br.readLine();
		InetAddress ip=InetAddress.getByName(site);
		System.out.println("Ip Address ="+ip);

	
	}

}
*/
/*
import java.net.*;
class URLdemo{

	public static void main(String[]args)throws  MalformedURLException{
	
		URL obj=new URL("https://core2web.in:90");
		System.out.println(obj.getProtocol());
		System.out.println(obj.getPort());
		System.out.println(obj.getFile());


	
	}

}
*/
/*
import java.io.*;
import java.net.*;
import java.util.*;

class URLConnectionDemo{

	public static void main(String[]args)throws IOException{
	
		URL obj=new URL ("https://www.core2web.in");
		URLConnection conn=obj.openConnection();
		System.out.println("Last Modified Date ="+new Date(conn.getLastModified()));
	
	}


}

*/

import java.net.*;
import java.io.*;

class Server{

	public static void main(String[]args)throws IOException{
	
		ServerSocket ss= new ServerSocket(1200);
		Socket s=ss.accept();
		System.out.println("Connection Established ");
		OutputStream os=s.getOutputStream();
		PrintStream ps=new PrintStream(os);
		ps.println("Hello client");
		ps.println("Go to Hell");

		ps.close();s.close();ss.close();


	
	}


}



















