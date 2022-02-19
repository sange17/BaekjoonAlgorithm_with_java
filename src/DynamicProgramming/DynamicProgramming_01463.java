package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_01463 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(n >= 5) {
			count += n / 5;
			n /= 5;
		}
		
		System.out.println(count);
		br.close();
	}
}
