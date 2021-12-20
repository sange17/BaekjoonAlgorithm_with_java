package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mathematics_17427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += (n / i) * i;
		}
		
		br.close();
		System.out.println(sum);
	}
}
