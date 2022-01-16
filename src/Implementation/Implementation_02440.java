package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Implementation_02440 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = n-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
