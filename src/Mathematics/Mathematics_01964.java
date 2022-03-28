package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mathematics_01964 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long add = 7;
		long result = 5;
		
		
		for(int i = 2; i <= n; i++) {
			result += add;
			add += 3;		
		}
		
		System.out.println(result % 45678);
		br.close();
	}
}
