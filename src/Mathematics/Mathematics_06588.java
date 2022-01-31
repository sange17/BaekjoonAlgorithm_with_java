package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_06588 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int array[] = new int[n];
			
			if(br.readLine() == "0") break;
			
			for(int i = 3; i < n; i++) {
				boolean isPrime = true;
				
				for(int j = 2; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						isPrime = false;
						break;
					}
				}
				
				if(isPrime) {
					array[i-3] = i;
				}
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(array[i]);
			}
		}
	}
}
