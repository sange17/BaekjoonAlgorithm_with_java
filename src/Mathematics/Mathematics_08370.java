package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mathematics_08370 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int n1k1 = Integer.parseInt(str[0]) * Integer.parseInt(str[1]);
		int n2k2 = Integer.parseInt(str[2]) * Integer.parseInt(str[3]);
		
		System.out.println(n1k1 + n2k2);
		br.close();
	}
}
