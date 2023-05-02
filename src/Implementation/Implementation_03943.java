package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_03943 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int num = 0;
		int max = 0;
		for(int i = 0; i < T; i++) {
			
			num = Integer.parseInt(br.readLine());
			max = num;
			
			while(true) {
				
				if(num == 1) break;
				
				if(num % 2 == 0) {
					
					num /= 2;
				}else if(num % 2 == 1) {
					
					num = num * 3 + 1;
				}
				
				if(num > max) {
					max = num;
				}
			}
			
			sb.append(max + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
