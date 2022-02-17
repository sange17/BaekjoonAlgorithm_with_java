package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_06588 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] isPrime = new boolean[1000001];
		
		for(int i = 2; i <= 1000000; i++) {
			isPrime[i] = true;
		}
		
		for(int i = 2; i <= Math.sqrt(1000000); i++) {
			for(int j = i * i; j <= 1000000; j += i) {
				if(!isPrime[j]) continue;
				isPrime[j] = false;
			}
		}
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			boolean isPrimeCheck = false;
			
			if(n == 0) {
				System.out.println(sb);
				br.close();
				break;
			}
			
			for(int i = 2; i <= n / 2; i++) {
				if(isPrime[i] && isPrime[n-i]) {
					sb.append(n + " = "+ i + " + " + (n - i)).append("\n");
					isPrimeCheck = true;
					break;
				}
			}
			
			if(!isPrimeCheck) sb.append("Goldbach's conjecture is wrong.").append("\n");
		}
	}
}
