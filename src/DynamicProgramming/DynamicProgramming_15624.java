package DynamicProgramming;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class DynamicProgramming_15624 {
	public static void main(String[] args) throws IOException{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 1; 
		int c = 1;
		int temp = 0;
		
		if(n == 0) {
			System.out.println(a);
		}else if(n == 1) {
			System.out.println(b);
		}else {
			for(int i = 2; i <= n; i++) {
				temp = c;
				a = b % 1000000007;
				b = temp % 1000000007;
				c = a + b;
			}			
			System.out.println(b);
		}
		br.close();
	}
}
