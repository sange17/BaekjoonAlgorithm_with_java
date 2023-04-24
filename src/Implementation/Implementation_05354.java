package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_05354 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int num = 0;
		for(int i = 0; i < T; i++) {
			
			num = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < num; j++) {
				
				if(j == 0 || j == num - 1) {
					
					for(int k = 0; k < num; k++) {
						
						sb.append("#");
					}
				}else {
					sb.append("#");
					
					for(int k = 0; k < num - 2; k++) {
						
						sb.append("J");
					}
					
					sb.append("#");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
