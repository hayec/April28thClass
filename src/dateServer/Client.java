package dateServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client 
{
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		int n = 0;
		while(n < 3)
		{
			String serverAddress = "localhost";
			Socket s = new Socket(serverAddress, 9090);
			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String answer = input.readLine();
			System.out.println(answer);
			n++;
		}
	}
}
