package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_03460 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			int idx = 0;
			while(n != 0) {
				
				if(n % 2 == 1) {
					
					sb.append(idx + " ");
				}
				
				n /= 2;
				idx++;
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
