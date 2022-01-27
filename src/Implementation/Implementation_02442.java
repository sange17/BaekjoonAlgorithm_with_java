package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Implementation_02442 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
