package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mathematics_02581 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		boolean isPrime = true;
		
		for(int i = m; i <= n; i++) {
			if(i == 1) {
				continue;
			}
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				if(sum == 0) min = i;
				sum += i;
			}else {
				isPrime = true;
				continue;
			}
		}
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else System.out.println(-1);
		
		br.close();
	}
}


