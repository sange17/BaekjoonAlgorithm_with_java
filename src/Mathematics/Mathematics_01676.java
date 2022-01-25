package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_01676 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int fac = 1;
		
		while(true) {
			if(n == 0) break;
			
			fac *= n;
			
			String str = Integer.toString(fac);
			
			n--;
		}
		
		System.out.println(fac);
	}
}
