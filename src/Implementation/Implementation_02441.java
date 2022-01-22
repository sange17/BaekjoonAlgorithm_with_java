package Implementation;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Implementation_02441 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			
			for(int k = n-i; k > 0; k--) {
				System.out.print('*');
			}
			System.out.print("\n");
		}
		br.close();
	}
}
