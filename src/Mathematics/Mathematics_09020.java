package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_09020 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		int[] array = new int[10001];
		boolean[] isPrime = new boolean[10001];
		
		for(int i = 2; i <= 10000; i++) {
			isPrime[i] = true;
			array[i] = i;
		}
		
		for(int i = 2; i <= Math.sqrt(10000); i++) {
			for(int j = i * 2; j <= 10000; j += i) {
				if(!isPrime[j]) continue;
				isPrime[j] = false;
			}
		}
		
		for(int i = 2; i <= Math.sqrt(10000); i++) {
			if(isPrime[i] == true) array[i] = i;
		}
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			for(int j = 0; j <= n/2; j++) {
				if(isPrime[(n/2)-j] && isPrime[(n/2)+j]) {
					sb.append(array[(n/2)-j] + " " + array[(n/2)+j]).append("\n");
					break;
				}
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
