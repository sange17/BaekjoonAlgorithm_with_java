package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mathematics_01929 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String array[] = new String[2];
		array = br.readLine().split(" ");
		int m = Integer.parseInt(array[0]);
		int n = Integer.parseInt(array[1]);
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
				sb.append(i).append("\n");
			}else {
				isPrime = true;
				continue;
			}
		}
		System.out.println(sb);
	}
}
