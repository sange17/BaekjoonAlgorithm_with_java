package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_05341 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = 0;
		int sum = 0;
		while(true) {
			
			num = Integer.parseInt(br.readLine());
			
			if(num == 0) break;
			
			for(int i = 1; i <= num; i++) {
				sum += i;
			}
			
			sb.append(sum + "\n");
			sum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
