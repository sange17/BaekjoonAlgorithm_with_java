package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Mathematics_04892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		int idx = 1;
		String status = "";
		int num = 0;
		while(true) {
			
			n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			// n1
			n *= 3;
			
			if(n % 2 == 0) {
				status = "even";
			}else {
				status = "odd";
			}
			
			// n2
			if(n % 2 == 0) {
				n /= 2;
			}else {
				n = (n + 1) / 2;
			}
			
			// n3
			n *= 3;
			
			// n4
			n /= 9;
			
			sb.append(idx + ". " + status + " " + n + "\n");
			
			idx++;
		}
		
		System.out.println(sb);
		br.close();
	}
}
