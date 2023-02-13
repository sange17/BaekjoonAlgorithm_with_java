package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_09506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		int sum = 0;
		int[] array;
		while(true) {
			
			n = Integer.parseInt(br.readLine());
			
			if(n == -1) break;
			
			array = new int[n / 2];
			
			for(int i = 1; i <= (n / 2); i++) {
				
				if(n % i == 0) {
					array[i - 1] = i;
					sum += i;
				}
			}
			
			if(sum == n) {
				
				sb.append(n + " = 1 ");
				
				for(int i = 1; i < array.length; i++) {
					
					if(array[i] != 0) {
						sb.append("+ " + array[i] + " ");						
					}
				}
				sb.append("\n");
			}else {
				
				sb.append(n + " is NOT perfect.\n");
			}
			
			sum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
