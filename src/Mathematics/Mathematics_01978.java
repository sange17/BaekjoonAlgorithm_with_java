package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_01978 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String [] array = new String [n];
		array = br.readLine().split(" ");
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int idx = Integer.parseInt(array[i]);
			boolean isPrime = true;
			
			if(idx==1) continue;

			for(int j = 2; j <= Math.sqrt(idx); j++) {
				if(idx % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) count++;
		}
			
		System.out.println(count);
	}
}
