package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics_16486 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double d1 = Integer.parseInt(br.readLine());
		double d2 = Integer.parseInt(br.readLine());
		
		double round = (d1 * 2) + (2 * 3.141592 * d2);
		
		System.out.println(round);
		br.close();
	}
}
