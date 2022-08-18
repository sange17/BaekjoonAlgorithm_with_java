package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_01094 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		while(true) {
			if(X == 1) {
				count++;
				break;
			}
			
			if(X % 2 == 1) {
				count++;
			}
			
			X = X >> 1;
			
		}
		
		System.out.println(count);
		br.close();
		
	}
}
