package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_04504 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 0;
		while(true) {
			
			num = Integer.parseInt(br.readLine());
			
			if(num == 0) break;
			
			if(num % N != 0) {
				sb.append(num + " is NOT a multiple of " + N + ".\n");
			}else {
				sb.append(num + " is a multiple of " + N + ".\n");
			}
		}
		System.out.println(sb);
		br.close();
	}
}
