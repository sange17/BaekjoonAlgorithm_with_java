package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_11687 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = n * 5;
		int count = 0;
		
		while(m >= 5) {
			count += m / 5;
			m /= 5;
		}
		
		if(count == n) {
			System.out.println(n*5);			
		}else {
			System.out.println(-1);
		}
		br.close();
	}
}
