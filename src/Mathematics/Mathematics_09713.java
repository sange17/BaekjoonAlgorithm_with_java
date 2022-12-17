package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_09713 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int num = 0;
		int sum = 0;
		for(int i = 0; i < T; i++) {
			
			num = Integer.parseInt(br.readLine());
			
			for(int j = 1; j <= num; j++) {
				
				if(j % 2 == 1) {
					
					sum += j;
				}				
			}
			
			sb.append(sum + "\n");
			sum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
